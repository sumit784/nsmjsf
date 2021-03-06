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
 * Floorsheet generated by hbm2java
 */
@Entity
@Table(name = "floorsheet", catalog = "admin_nsmjsf")
public class Floorsheet implements java.io.Serializable {

	private Integer floorsheetId;
	private Company company;
	private long floorsheetTransactionNo;
	private String floorsheetStockSymbol;
	private int floorsheetBuyerBroker;
	private int floorsheetSellerBroker;
	private int floorsheetQuantity;
	private float floorsheetRate;
	private float floorsheetAmount;

	public Floorsheet() {
	}

	public Floorsheet(Company company, long floorsheetTransactionNo,
			String floorsheetStockSymbol, int floorsheetBuyerBroker,
			int floorsheetSellerBroker, int floorsheetQuantity,
			float floorsheetRate, float floorsheetAmount) {
		this.company = company;
		this.floorsheetTransactionNo = floorsheetTransactionNo;
		this.floorsheetStockSymbol = floorsheetStockSymbol;
		this.floorsheetBuyerBroker = floorsheetBuyerBroker;
		this.floorsheetSellerBroker = floorsheetSellerBroker;
		this.floorsheetQuantity = floorsheetQuantity;
		this.floorsheetRate = floorsheetRate;
		this.floorsheetAmount = floorsheetAmount;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "floorsheet_id", unique = true, nullable = false)
	public Integer getFloorsheetId() {
		return this.floorsheetId;
	}

	public void setFloorsheetId(Integer floorsheetId) {
		this.floorsheetId = floorsheetId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "floorsheet_company_id", nullable = false)
	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Column(name = "floorsheet_transaction_no", nullable = false)
	public long getFloorsheetTransactionNo() {
		return this.floorsheetTransactionNo;
	}

	public void setFloorsheetTransactionNo(long floorsheetTransactionNo) {
		this.floorsheetTransactionNo = floorsheetTransactionNo;
	}

	@Column(name = "floorsheet_stock_symbol", nullable = false)
	public String getFloorsheetStockSymbol() {
		return this.floorsheetStockSymbol;
	}

	public void setFloorsheetStockSymbol(String floorsheetStockSymbol) {
		this.floorsheetStockSymbol = floorsheetStockSymbol;
	}

	@Column(name = "floorsheet_buyer_broker", nullable = false)
	public int getFloorsheetBuyerBroker() {
		return this.floorsheetBuyerBroker;
	}

	public void setFloorsheetBuyerBroker(int floorsheetBuyerBroker) {
		this.floorsheetBuyerBroker = floorsheetBuyerBroker;
	}

	@Column(name = "floorsheet_seller_broker", nullable = false)
	public int getFloorsheetSellerBroker() {
		return this.floorsheetSellerBroker;
	}

	public void setFloorsheetSellerBroker(int floorsheetSellerBroker) {
		this.floorsheetSellerBroker = floorsheetSellerBroker;
	}

	@Column(name = "floorsheet_quantity", nullable = false)
	public int getFloorsheetQuantity() {
		return this.floorsheetQuantity;
	}

	public void setFloorsheetQuantity(int floorsheetQuantity) {
		this.floorsheetQuantity = floorsheetQuantity;
	}

	@Column(name = "floorsheet_rate", nullable = false, precision = 12, scale = 0)
	public float getFloorsheetRate() {
		return this.floorsheetRate;
	}

	public void setFloorsheetRate(float floorsheetRate) {
		this.floorsheetRate = floorsheetRate;
	}

	@Column(name = "floorsheet_amount", nullable = false, precision = 12, scale = 0)
	public float getFloorsheetAmount() {
		return this.floorsheetAmount;
	}

	public void setFloorsheetAmount(float floorsheetAmount) {
		this.floorsheetAmount = floorsheetAmount;
	}

}
