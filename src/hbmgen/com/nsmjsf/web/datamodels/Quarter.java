package com.nsmjsf.web.datamodels;

// Generated Mar 14, 2015 9:52:11 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Quarter generated by hbm2java
 */
@Entity
@Table(name = "quarter", catalog = "admin_nsmjsf")
public class Quarter implements java.io.Serializable {

	private Integer quarterId;
	private int quarterLabel;
	private Set<FinancialReport> financialReports = new HashSet<FinancialReport>(
			0);
	private Set<FinancialHighlight> financialHighlights = new HashSet<FinancialHighlight>(
			0);

	public Quarter() {
	}

	public Quarter(int quarterLabel) {
		this.quarterLabel = quarterLabel;
	}

	public Quarter(int quarterLabel, Set<FinancialReport> financialReports,
			Set<FinancialHighlight> financialHighlights) {
		this.quarterLabel = quarterLabel;
		this.financialReports = financialReports;
		this.financialHighlights = financialHighlights;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "quarter_id", unique = true, nullable = false)
	public Integer getQuarterId() {
		return this.quarterId;
	}

	public void setQuarterId(Integer quarterId) {
		this.quarterId = quarterId;
	}

	@Column(name = "quarter_label", nullable = false)
	public int getQuarterLabel() {
		return this.quarterLabel;
	}

	public void setQuarterLabel(int quarterLabel) {
		this.quarterLabel = quarterLabel;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "quarter")
	public Set<FinancialReport> getFinancialReports() {
		return this.financialReports;
	}

	public void setFinancialReports(Set<FinancialReport> financialReports) {
		this.financialReports = financialReports;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "quarter")
	public Set<FinancialHighlight> getFinancialHighlights() {
		return this.financialHighlights;
	}

	public void setFinancialHighlights(
			Set<FinancialHighlight> financialHighlights) {
		this.financialHighlights = financialHighlights;
	}

}
