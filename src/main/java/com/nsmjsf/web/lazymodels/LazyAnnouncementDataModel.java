package com.nsmjsf.web.lazymodels;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

import com.nsmjsf.web.datamodels.Announcement;
import com.nsmjsf.web.sorters.AnnouncementSorter;

public class LazyAnnouncementDataModel extends LazyDataModel<Announcement> {
	private static final Log log = LogFactory
			.getLog(LazyAnnouncementDataModel.class);

	/**
	 * 
	 */
	private static final long serialVersionUID = 8939496625458060791L;
	private List<Announcement> announcementList;

	public LazyAnnouncementDataModel(List<Announcement> announcementList) {
		this.announcementList = announcementList;
	}

	@Override
	public Announcement getRowData(String rowKey) {
		for (Announcement announcement : announcementList) {
			if (announcement.getAnnouncementId().toString()
					.equalsIgnoreCase(rowKey))
				return announcement;
		}

		return null;
	}

	@Override
	public Object getRowKey(Announcement object) {
		return object.getAnnouncementId();
	}

	@Override
	public List<Announcement> load(int first, int pageSize, String sortField,
			SortOrder sortOrder, Map<String, Object> filters) {

		log.info("sortfield:" + sortField);
		List<Announcement> data = new ArrayList<Announcement>();

		// filter
		for (Announcement announcement : announcementList) {
			boolean match = true;

			if (filters != null) {
				for (Iterator<String> it = filters.keySet().iterator(); it
						.hasNext();) {
					try {
						String filterProperty = it.next();
						Object filterValue = filters.get(filterProperty);
						Field field = announcement.getClass().getDeclaredField(
								filterProperty);
						field.setAccessible(true);
						String fieldValue = String.valueOf(field
								.get(announcement));
						log.info("filterField:" + filterProperty);
						log.info("filterValue:" + fieldValue);

						if (filterValue == null
								|| fieldValue
										.startsWith(filterValue.toString())) {
							match = true;
						} else {
							match = false;
							break;
						}
					} catch (Exception e) {
						match = false;
					}
				}
			}

			if (match) {
				data.add(announcement);
			}
		}

		// sort
		if (sortField != null) {
			Collections
					.sort(data, new AnnouncementSorter(sortField, sortOrder));
		}

		// rowCount
		int dataSize = data.size();
		this.setRowCount(dataSize);

		// paginate
		if (dataSize > pageSize) {
			try {
				return data.subList(first, first + pageSize);
			} catch (IndexOutOfBoundsException e) {
				return data.subList(first, first + (dataSize % pageSize));
			}
		} else {
			return data;
		}
	}

}
