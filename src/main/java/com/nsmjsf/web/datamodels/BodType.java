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
 * BodType generated by hbm2java
 */
@Entity
@Table(name = "bod_type", catalog = "admin_nsmjsf")
public class BodType implements java.io.Serializable {

	private Integer bodTypeId;
	private String bodTypeLabel;
	private Set<Bod> bods = new HashSet<Bod>(0);

	public BodType() {
	}

	public BodType(String bodTypeLabel) {
		this.bodTypeLabel = bodTypeLabel;
	}

	public BodType(String bodTypeLabel, Set<Bod> bods) {
		this.bodTypeLabel = bodTypeLabel;
		this.bods = bods;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "bod_type_id", unique = true, nullable = false)
	public Integer getBodTypeId() {
		return this.bodTypeId;
	}

	public void setBodTypeId(Integer bodTypeId) {
		this.bodTypeId = bodTypeId;
	}

	@Column(name = "bod_type_label", nullable = false)
	public String getBodTypeLabel() {
		return this.bodTypeLabel;
	}

	public void setBodTypeLabel(String bodTypeLabel) {
		this.bodTypeLabel = bodTypeLabel;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bodType")
	public Set<Bod> getBods() {
		return this.bods;
	}

	public void setBods(Set<Bod> bods) {
		this.bods = bods;
	}

}