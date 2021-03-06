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
 * CurrencyType generated by hbm2java
 */
@Entity
@Table(name = "currency_type", catalog = "admin_nsmjsf")
public class CurrencyType implements java.io.Serializable {

	private Integer currencyTypeId;
	private String currencyTypeLabel;
	private Set<CurrencyRate> currencyRates = new HashSet<CurrencyRate>(0);

	public CurrencyType() {
	}

	public CurrencyType(String currencyTypeLabel) {
		this.currencyTypeLabel = currencyTypeLabel;
	}

	public CurrencyType(String currencyTypeLabel,
			Set<CurrencyRate> currencyRates) {
		this.currencyTypeLabel = currencyTypeLabel;
		this.currencyRates = currencyRates;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "currency_type_id", unique = true, nullable = false)
	public Integer getCurrencyTypeId() {
		return this.currencyTypeId;
	}

	public void setCurrencyTypeId(Integer currencyTypeId) {
		this.currencyTypeId = currencyTypeId;
	}

	@Column(name = "currency_type_label", nullable = false)
	public String getCurrencyTypeLabel() {
		return this.currencyTypeLabel;
	}

	public void setCurrencyTypeLabel(String currencyTypeLabel) {
		this.currencyTypeLabel = currencyTypeLabel;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "currencyType")
	public Set<CurrencyRate> getCurrencyRates() {
		return this.currencyRates;
	}

	public void setCurrencyRates(Set<CurrencyRate> currencyRates) {
		this.currencyRates = currencyRates;
	}

}
