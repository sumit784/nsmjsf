package com.nsmjsf.web.datamodels;

// Generated Feb 28, 2015 3:31:39 PM by Hibernate Tools 3.4.0.CR1

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
 * AuditStatus generated by hbm2java
 */
@Entity
@Table(name = "audit_status", catalog = "admin_nsmjsf")
public class AuditStatus implements java.io.Serializable {

	private Integer auditStatusId;
	private String auditStatusLabel;
	private Set<FinancialReport> financialReports = new HashSet<FinancialReport>(
			0);

	public AuditStatus() {
	}

	public AuditStatus(String auditStatusLabel) {
		this.auditStatusLabel = auditStatusLabel;
	}

	public AuditStatus(String auditStatusLabel,
			Set<FinancialReport> financialReports) {
		this.auditStatusLabel = auditStatusLabel;
		this.financialReports = financialReports;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "audit_status_id", unique = true, nullable = false)
	public Integer getAuditStatusId() {
		return this.auditStatusId;
	}

	public void setAuditStatusId(Integer auditStatusId) {
		this.auditStatusId = auditStatusId;
	}

	@Column(name = "audit_status_label", nullable = false)
	public String getAuditStatusLabel() {
		return this.auditStatusLabel;
	}

	public void setAuditStatusLabel(String auditStatusLabel) {
		this.auditStatusLabel = auditStatusLabel;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "auditStatus")
	public Set<FinancialReport> getFinancialReports() {
		return this.financialReports;
	}

	public void setFinancialReports(Set<FinancialReport> financialReports) {
		this.financialReports = financialReports;
	}

}