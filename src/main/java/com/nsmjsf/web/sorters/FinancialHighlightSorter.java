package com.nsmjsf.web.sorters;

import java.lang.reflect.Field;
import java.util.Comparator;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.primefaces.model.SortOrder;

import com.nsmjsf.web.datamodels.FinancialHighlight;

public class FinancialHighlightSorter implements Comparator<FinancialHighlight> {
	private static final Log log = LogFactory
			.getLog(FinancialHighlightSorter.class);

	private String sortField;

	private SortOrder sortOrder;

	public FinancialHighlightSorter(String sortField, SortOrder sortOrder) {
		this.sortField = sortField;
		this.sortOrder = sortOrder;
	}

	@Override
	public int compare(FinancialHighlight o1, FinancialHighlight o2) {
		try {
			log.info("sorting:" + this.sortField);

			Field field = o1.getClass().getDeclaredField(this.sortField);
			field.setAccessible(true);
			Object value1 = field.get(o1);

			Field field2 = o2.getClass().getDeclaredField(this.sortField);
			field.setAccessible(true);
			Object value2 = field.get(o2);

			int value = ((Comparable) value1).compareTo(value2);

			return SortOrder.ASCENDING.equals(sortOrder) ? value : -1 * value;
		} catch (Exception e) {
			log.info(e.toString());
			throw new RuntimeException();
		}
	}

}
