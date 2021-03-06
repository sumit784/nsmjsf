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

import com.nsmjsf.web.datamodels.IssueType;
import com.nsmjsf.web.sorters.IssueTypeSorter;

public class LazyIssueTypeDataModel extends LazyDataModel<IssueType> {
	private static final Log log = LogFactory
			.getLog(LazyIssueTypeDataModel.class);

	/**
	 * 
	 */
	private static final long serialVersionUID = 8939496625458060791L;
	private List<IssueType> issueTypeList;

	public LazyIssueTypeDataModel(List<IssueType> issueTypeList) {
		this.issueTypeList = issueTypeList;
	}

	@Override
	public IssueType getRowData(String rowKey) {
		for (IssueType issueType : issueTypeList) {
			if (issueType.getIssueTypeId().toString().equalsIgnoreCase(rowKey))
				return issueType;
		}

		return null;
	}

	@Override
	public Object getRowKey(IssueType object) {
		return object.getIssueTypeId();
	}

	@Override
	public List<IssueType> load(int first, int pageSize, String sortField,
			SortOrder sortOrder, Map<String, Object> filters) {

		log.info("sortfield:" + sortField);
		List<IssueType> data = new ArrayList<IssueType>();

		// filter
		for (IssueType issueType : issueTypeList) {
			boolean match = true;

			if (filters != null) {
				for (Iterator<String> it = filters.keySet().iterator(); it
						.hasNext();) {
					try {
						String filterProperty = it.next();
						Object filterValue = filters.get(filterProperty);
						Field field = issueType.getClass().getDeclaredField(
								filterProperty);
						field.setAccessible(true);
						String fieldValue = String
								.valueOf(field.get(issueType));
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
				data.add(issueType);
			}
		}

		// sort
		if (sortField != null) {
			Collections.sort(data, new IssueTypeSorter(sortField, sortOrder));
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
