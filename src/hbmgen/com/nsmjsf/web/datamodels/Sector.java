package com.nsmjsf.web.datamodels;

// Generated Feb 28, 2015 11:53:30 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Sector generated by hbm2java
 */
@Entity
@Table(name = "sector", catalog = "admin_nsmjsf")
public class Sector implements java.io.Serializable {

	private int sectorId;
	private String sectorLabel;
	private Set<Company> companies = new HashSet<Company>(0);

	public Sector() {
	}

	public Sector(int sectorId, String sectorLabel) {
		this.sectorId = sectorId;
		this.sectorLabel = sectorLabel;
	}

	public Sector(int sectorId, String sectorLabel, Set<Company> companies) {
		this.sectorId = sectorId;
		this.sectorLabel = sectorLabel;
		this.companies = companies;
	}

	@Id
	@Column(name = "sector_id", unique = true, nullable = false)
	public int getSectorId() {
		return this.sectorId;
	}

	public void setSectorId(int sectorId) {
		this.sectorId = sectorId;
	}

	@Column(name = "sector_label", nullable = false)
	public String getSectorLabel() {
		return this.sectorLabel;
	}

	public void setSectorLabel(String sectorLabel) {
		this.sectorLabel = sectorLabel;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sector")
	public Set<Company> getCompanies() {
		return this.companies;
	}

	public void setCompanies(Set<Company> companies) {
		this.companies = companies;
	}

}