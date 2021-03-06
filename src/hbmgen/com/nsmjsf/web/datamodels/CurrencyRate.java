package com.nsmjsf.web.datamodels;

// Generated Mar 14, 2015 9:52:11 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * CurrencyRate generated by hbm2java
 */
@Entity
@Table(name = "currency_rate", catalog = "admin_nsmjsf")
public class CurrencyRate implements java.io.Serializable {

	private Integer currencyRateId;
	private CurrencyType currencyType;
	private Float currencyRateBuy;
	private Float currencyRateSell;
	private Float currencyRatePerUnit;

	public CurrencyRate() {
	}

	public CurrencyRate(CurrencyType currencyType) {
		this.currencyType = currencyType;
	}

	public CurrencyRate(CurrencyType currencyType, Float currencyRateBuy,
			Float currencyRateSell, Float currencyRatePerUnit) {
		this.currencyType = currencyType;
		this.currencyRateBuy = currencyRateBuy;
		this.currencyRateSell = currencyRateSell;
		this.currencyRatePerUnit = currencyRatePerUnit;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "currency_rate_id", unique = true, nullable = false)
	public Integer getCurrencyRateId() {
		return this.currencyRateId;
	}

	public void setCurrencyRateId(Integer currencyRateId) {
		this.currencyRateId = currencyRateId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "currency_rate_type_id", nullable = false)
	public CurrencyType getCurrencyType() {
		return this.currencyType;
	}

	public void setCurrencyType(CurrencyType currencyType) {
		this.currencyType = currencyType;
	}

	@Column(name = "currency_rate_buy", precision = 12, scale = 0)
	public Float getCurrencyRateBuy() {
		return this.currencyRateBuy;
	}

	public void setCurrencyRateBuy(Float currencyRateBuy) {
		this.currencyRateBuy = currencyRateBuy;
	}

	@Column(name = "currency_rate_sell", precision = 12, scale = 0)
	public Float getCurrencyRateSell() {
		return this.currencyRateSell;
	}

	public void setCurrencyRateSell(Float currencyRateSell) {
		this.currencyRateSell = currencyRateSell;
	}

	@Column(name = "currency_rate_per_unit", precision = 12, scale = 0)
	public Float getCurrencyRatePerUnit() {
		return this.currencyRatePerUnit;
	}

	public void setCurrencyRatePerUnit(Float currencyRatePerUnit) {
		this.currencyRatePerUnit = currencyRatePerUnit;
	}

}
