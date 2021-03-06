package com.nsmjsf.web.datamodels;

// Generated Mar 2, 2015 3:36:21 PM by Hibernate Tools 3.4.0.CR1

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
 * IssueManager generated by hbm2java
 */
@Entity
@Table(name = "issue_manager", catalog = "admin_nsmjsf")
public class IssueManager implements java.io.Serializable {

	private Integer issueManagerId;
	private String issueManagerAddress;
	private String issueManagerPhone;
	private String issueManagerEmail;
	private String issueManagerWeb;
	private Set<Auction> auctions = new HashSet<Auction>(0);
	private Set<CertificateDividendDistribution> certificateDividendDistributions = new HashSet<CertificateDividendDistribution>(
			0);
	private Set<Issue> issues = new HashSet<Issue>(0);

	public IssueManager() {
	}

	public IssueManager(String issueManagerAddress, String issueManagerPhone,
			String issueManagerEmail, String issueManagerWeb) {
		this.issueManagerAddress = issueManagerAddress;
		this.issueManagerPhone = issueManagerPhone;
		this.issueManagerEmail = issueManagerEmail;
		this.issueManagerWeb = issueManagerWeb;
	}

	public IssueManager(
			String issueManagerAddress,
			String issueManagerPhone,
			String issueManagerEmail,
			String issueManagerWeb,
			Set<Auction> auctions,
			Set<CertificateDividendDistribution> certificateDividendDistributions,
			Set<Issue> issues) {
		this.issueManagerAddress = issueManagerAddress;
		this.issueManagerPhone = issueManagerPhone;
		this.issueManagerEmail = issueManagerEmail;
		this.issueManagerWeb = issueManagerWeb;
		this.auctions = auctions;
		this.certificateDividendDistributions = certificateDividendDistributions;
		this.issues = issues;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "issue_manager_id", unique = true, nullable = false)
	public Integer getIssueManagerId() {
		return this.issueManagerId;
	}

	public void setIssueManagerId(Integer issueManagerId) {
		this.issueManagerId = issueManagerId;
	}

	@Column(name = "issue_manager_address", nullable = false, length = 65535)
	public String getIssueManagerAddress() {
		return this.issueManagerAddress;
	}

	public void setIssueManagerAddress(String issueManagerAddress) {
		this.issueManagerAddress = issueManagerAddress;
	}

	@Column(name = "issue_manager_phone", nullable = false)
	public String getIssueManagerPhone() {
		return this.issueManagerPhone;
	}

	public void setIssueManagerPhone(String issueManagerPhone) {
		this.issueManagerPhone = issueManagerPhone;
	}

	@Column(name = "issue_manager_email", nullable = false)
	public String getIssueManagerEmail() {
		return this.issueManagerEmail;
	}

	public void setIssueManagerEmail(String issueManagerEmail) {
		this.issueManagerEmail = issueManagerEmail;
	}

	@Column(name = "issue_manager_web", nullable = false, length = 65535)
	public String getIssueManagerWeb() {
		return this.issueManagerWeb;
	}

	public void setIssueManagerWeb(String issueManagerWeb) {
		this.issueManagerWeb = issueManagerWeb;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "issueManager")
	public Set<Auction> getAuctions() {
		return this.auctions;
	}

	public void setAuctions(Set<Auction> auctions) {
		this.auctions = auctions;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "issueManager")
	public Set<CertificateDividendDistribution> getCertificateDividendDistributions() {
		return this.certificateDividendDistributions;
	}

	public void setCertificateDividendDistributions(
			Set<CertificateDividendDistribution> certificateDividendDistributions) {
		this.certificateDividendDistributions = certificateDividendDistributions;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "issueManager")
	public Set<Issue> getIssues() {
		return this.issues;
	}

	public void setIssues(Set<Issue> issues) {
		this.issues = issues;
	}

}
