package com.accp.domain;

import java.util.Date;

public class Purchase {
    private Integer purchaseid;

    private String odd;

    private Date deliverytime;

    private Integer supplierid;

    private Integer userid;

    private String remarks;

    private Float grossmoney;

    public Integer getPurchaseid() {
        return purchaseid;
    }

    public void setPurchaseid(Integer purchaseid) {
        this.purchaseid = purchaseid;
    }

    public String getOdd() {
        return odd;
    }

    public void setOdd(String odd) {
        this.odd = odd;
    }

    public Date getDeliverytime() {
        return deliverytime;
    }

    public void setDeliverytime(Date deliverytime) {
        this.deliverytime = deliverytime;
    }

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Float getGrossmoney() {
        return grossmoney;
    }

    public void setGrossmoney(Float grossmoney) {
        this.grossmoney = grossmoney;
    }
}