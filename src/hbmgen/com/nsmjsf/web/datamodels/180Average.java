package com.nsmjsf.web.datamodels;
// Generated Feb 28, 2015 2:38:39 PM by Hibernate Tools 3.4.0.CR1


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
 * 180Average generated by hbm2java
 */
@Entity
@Table(name="180_average"
    ,catalog="admin_nsmjsf"
)
public class 180Average  implements java.io.Serializable {


     private Integer 180AverageId;
     private Company company;
     private int noOfTransactions;
     private float maxPrice;
     private float minPrice;
     private float closePrice;
     private int totalShare;
     private float amount;
     private float prevClosing;
     private float diff;
     private Date tradedDate;
     private boolean deleted;

    public 180Average() {
    }

    public 180Average(Company company, int noOfTransactions, float maxPrice, float minPrice, float closePrice, int totalShare, float amount, float prevClosing, float diff, Date tradedDate, boolean deleted) {
       this.company = company;
       this.noOfTransactions = noOfTransactions;
       this.maxPrice = maxPrice;
       this.minPrice = minPrice;
       this.closePrice = closePrice;
       this.totalShare = totalShare;
       this.amount = amount;
       this.prevClosing = prevClosing;
       this.diff = diff;
       this.tradedDate = tradedDate;
       this.deleted = deleted;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="180_average_id", unique=true, nullable=false)
    public Integer get180AverageId() {
        return this.180AverageId;
    }
    
    public void set180AverageId(Integer 180AverageId) {
        this.180AverageId = 180AverageId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="company_id", nullable=false)
    public Company getCompany() {
        return this.company;
    }
    
    public void setCompany(Company company) {
        this.company = company;
    }

    
    @Column(name="no_of_transactions", nullable=false)
    public int getNoOfTransactions() {
        return this.noOfTransactions;
    }
    
    public void setNoOfTransactions(int noOfTransactions) {
        this.noOfTransactions = noOfTransactions;
    }

    
    @Column(name="max_price", nullable=false, precision=12, scale=0)
    public float getMaxPrice() {
        return this.maxPrice;
    }
    
    public void setMaxPrice(float maxPrice) {
        this.maxPrice = maxPrice;
    }

    
    @Column(name="min_price", nullable=false, precision=12, scale=0)
    public float getMinPrice() {
        return this.minPrice;
    }
    
    public void setMinPrice(float minPrice) {
        this.minPrice = minPrice;
    }

    
    @Column(name="close_price", nullable=false, precision=12, scale=0)
    public float getClosePrice() {
        return this.closePrice;
    }
    
    public void setClosePrice(float closePrice) {
        this.closePrice = closePrice;
    }

    
    @Column(name="total_share", nullable=false)
    public int getTotalShare() {
        return this.totalShare;
    }
    
    public void setTotalShare(int totalShare) {
        this.totalShare = totalShare;
    }

    
    @Column(name="amount", nullable=false, precision=12, scale=0)
    public float getAmount() {
        return this.amount;
    }
    
    public void setAmount(float amount) {
        this.amount = amount;
    }

    
    @Column(name="prev_closing", nullable=false, precision=12, scale=0)
    public float getPrevClosing() {
        return this.prevClosing;
    }
    
    public void setPrevClosing(float prevClosing) {
        this.prevClosing = prevClosing;
    }

    
    @Column(name="diff", nullable=false, precision=12, scale=0)
    public float getDiff() {
        return this.diff;
    }
    
    public void setDiff(float diff) {
        this.diff = diff;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="traded_date", nullable=false, length=0)
    public Date getTradedDate() {
        return this.tradedDate;
    }
    
    public void setTradedDate(Date tradedDate) {
        this.tradedDate = tradedDate;
    }

    
    @Column(name="deleted", nullable=false)
    public boolean isDeleted() {
        return this.deleted;
    }
    
    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }




}

