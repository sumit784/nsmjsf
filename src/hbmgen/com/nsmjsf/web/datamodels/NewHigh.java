package com.nsmjsf.web.datamodels;

// Generated Feb 28, 2015 11:53:30 PM by Hibernate Tools 3.4.0.CR1

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
 * NewHigh generated by hbm2java
 */
@Entity
@Table(name = "new_high", catalog = "admin_nsmjsf")
public class NewHigh implements java.io.Serializable {

	private Integer newHighId;
	private Company company;
	private float newHighPreviousPrice;
	private Date newHighPreviousDate;
	private float newHighCurrentValue;
	private Date newHighCurrentDate;

	public NewHigh() {
	}

	public NewHigh(Company company, float newHighPreviousPrice,
			Date newHighPreviousDate, float newHighCurrentValue,
			Date newHighCurrentDate) {
		this.company = company;
		this.newHighPreviousPrice = newHighPreviousPrice;
		this.newHighPreviousDate = newHighPreviousDate;
		this.newHighCurrentValue = newHighCurrentValue;
		this.newHighCurrentDate = newHighCurrentDate;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "new_high_id", unique = true, nullable = false)
	public Integer getNewHighId() {
		return this.newHighId;
	}

	public void setNewHighId(Integer newHighId) {
		this.newHighId = newHighId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "new_high_company_id", nullable = false)
	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Column(name = "new_high_previous_price", nullable = false, precision = 12, scale = 0)
	public float getNewHighPreviousPrice() {
		return this.newHighPreviousPrice;
	}

	public void setNewHighPreviousPrice(float newHighPreviousPrice) {
		this.newHighPreviousPrice = newHighPreviousPrice;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "new_high_previous_date", nullable = false, length = 0)
	public Date getNewHighPreviousDate() {
		return this.newHighPreviousDate;
	}

	public void setNewHighPreviousDate(Date newHighPreviousDate) {
		this.newHighPreviousDate = newHighPreviousDate;
	}

	@Column(name = "new_high_current_value", nullable = false, precision = 12, scale = 0)
	public float getNewHighCurrentValue() {
		return this.newHighCurrentValue;
	}

	public void setNewHighCurrentValue(float newHighCurrentValue) {
		this.newHighCurrentValue = newHighCurrentValue;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "new_high_current_date", nullable = false, length = 0)
	public Date getNewHighCurrentDate() {
		return this.newHighCurrentDate;
	}

	public void setNewHighCurrentDate(Date newHighCurrentDate) {
		this.newHighCurrentDate = newHighCurrentDate;
	}

}