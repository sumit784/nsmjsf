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

import com.nsmjsf.web.datamodels.EnergyType;
import com.nsmjsf.web.sorters.EnergyTypeSorter;

public class LazyEnergyTypeDataModel extends LazyDataModel<EnergyType> {
	private static final Log log = LogFactory
			.getLog(LazyEnergyTypeDataModel.class);

	/**
	 * 
	 */
	private static final long serialVersionUID = 8939496625458060791L;
	private List<EnergyType> energyTypeList;

	public LazyEnergyTypeDataModel(List<EnergyType> energyTypeList) {
		this.energyTypeList = energyTypeList;
	}

	@Override
	public EnergyType getRowData(String rowKey) {
		for (EnergyType energyType : energyTypeList) {
			if (energyType.getEnergyTypeId().toString()
					.equalsIgnoreCase(rowKey))
				return energyType;
		}

		return null;
	}

	@Override
	public Object getRowKey(EnergyType object) {
		return object.getEnergyTypeId();
	}

	@Override
	public List<EnergyType> load(int first, int pageSize, String sortField,
			SortOrder sortOrder, Map<String, Object> filters) {

		log.info("sortfield:" + sortField);
		List<EnergyType> data = new ArrayList<EnergyType>();

		// filter
		for (EnergyType energyType : energyTypeList) {
			boolean match = true;

			if (filters != null) {
				for (Iterator<String> it = filters.keySet().iterator(); it
						.hasNext();) {
					try {
						String filterProperty = it.next();
						Object filterValue = filters.get(filterProperty);
						Field field = energyType.getClass().getDeclaredField(
								filterProperty);
						field.setAccessible(true);
						String fieldValue = String.valueOf(field
								.get(energyType));
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
				data.add(energyType);
			}
		}

		// sort
		if (sortField != null) {
			Collections.sort(data, new EnergyTypeSorter(sortField, sortOrder));
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
