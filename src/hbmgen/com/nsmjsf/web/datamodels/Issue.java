package com.nsmjsf.web.datamodels;

// Generated Mar 14, 2015 9:52:11 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Issue generated by hbm2java
 */
@Entity
@Table(name = "issue", catalog = "admin_nsmjsf")
public class Issue implements java.io.Serializable {

	private Integer issueId;
	private Company company;
	private Announcement announcement;
	private IssueType issueType;
	private IssueManager issueManager;
	private String issueRatio;
	private Integer issueFaceValue;
	private Date issueOpenDate;
	private Date issueClosingDate;
	private int issueQuantity;
	private String issueManager_1;
	private String issueLink;

	public Issue() {
	}

	public Issue(Company company, Announcement announcement,
			IssueType issueType, IssueManager issueManager, Date issueOpenDate,
			Date issueClosingDate, int issueQuantity, String issueManager_1,
			String issueLink) {
		this.company = company;
		this.announcement = announcement;
		this.issueType = issueType;
		this.issueManager = issueManager;
		this.issueOpenDate = issueOpenDate;
		this.issueClosingDate = issueClosingDate;
		this.issueQuantity = issueQuantity;
		this.issueManager_1 = issueManager_1;
		this.issueLink = issueLink;
	}

	public Issue(Company company, Announcement announcement,
			IssueType issueType, IssueManager issueManager, String issueRatio,
			Integer issueFaceValue, Date issueOpenDate, Date issueClosingDate,
			int issueQuantity, String issueManager_1, String issueLink) {
		this.company = company;
		this.announcement = announcement;
		this.issueType = issueType;
		this.issueManager = issueManager;
		this.issueRatio = issueRatio;
		this.issueFaceValue = issueFaceValue;
		this.issueOpenDate = issueOpenDate;
		this.issueClosingDate = issueClosingDate;
		this.issueQuantity = issueQuantity;
		this.issueManager_1 = issueManager_1;
		this.issueLink = issueLink;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "issue_id", unique = true, nullable = false)
	public Integer getIssueId() {
		return this.issueId;
	}

	public void setIssueId(Integer issueId) {
		this.issueId = issueId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "issue_company_id", nullable = false)
	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "issue_announcement_id", nullable = false)
	public Announcement getAnnouncement() {
		return this.announcement;
	}

	public void setAnnouncement(Announcement announcement) {
		this.announcement = announcement;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "issue_type_id", nullable = false)
	public IssueType getIssueType() {
		return this.issueType;
	}

	public void setIssueType(IssueType issueType) {
		this.issueType = issueType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "issue_manager_id", nullable = false)
	public IssueManager getIssueManager() {
		return this.issueManager;
	}

	public void setIssueManager(IssueManager issueManager) {
		this.issueManager = issueManager;
	}

	@Column(name = "issue_ratio")
	public String getIssueRatio() {
		return this.issueRatio;
	}

	public void setIssueRatio(String issueRatio) {
		this.issueRatio = issueRatio;
	}

	@Column(name = "issue_face_value")
	public Integer getIssueFaceValue() {
		return this.issueFaceValue;
	}

	public void setIssueFaceValue(Integer issueFaceValue) {
		this.issueFaceValue = issueFaceValue;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "issue_open_date", nullable = false, length = 0)
	public Date getIssueOpenDate() {
		return this.issueOpenDate;
	}

	public void setIssueOpenDate(Date issueOpenDate) {
		this.issueOpenDate = issueOpenDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "issue_closing_date", nullable = false, length = 0)
	public Date getIssueClosingDate() {
		return this.issueClosingDate;
	}

	public void setIssueClosingDate(Date issueClosingDate) {
		this.issueClosingDate = issueClosingDate;
	}

	@Column(name = "issue_quantity", nullable = false)
	public int getIssueQuantity() {
		return this.issueQuantity;
	}

	public void setIssueQuantity(int issueQuantity) {
		this.issueQuantity = issueQuantity;
	}

	@Column(name = "issue_manager", nullable = false, length = 65535)
	public String getIssueManager_1() {
		return this.issueManager_1;
	}

	public void setIssueManager_1(String issueManager_1) {
		this.issueManager_1 = issueManager_1;
	}

	@Column(name = "issue_link", nullable = false, length = 65535)
	public String getIssueLink() {
		return this.issueLink;
	}

	public void setIssueLink(String issueLink) {
		this.issueLink = issueLink;
	}

}
