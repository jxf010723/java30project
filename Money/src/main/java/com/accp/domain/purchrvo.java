package com.accp.domain;

import java.util.Date;

public class purchrvo {
	private Integer purchaseid;

    private String odd;

    private String deliverytime;
    
    private String detime;

    private String suppliername;

    private String userid;

    private String remarks;

    private Float grossmoney;
    
    private Integer shenghe;
    
    private Integer sl;

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

	public String getDeliverytime() {
		return deliverytime;
	}

	public void setDeliverytime(String deliverytime) {
		this.deliverytime = deliverytime;
	}

	public String getSuppliername() {
		return suppliername;
	}

	public void setSuppliername(String suppliername) {
		this.suppliername = suppliername;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
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

	public Integer getShenghe() {
		return shenghe;
	}

	public void setShenghe(Integer shenghe) {
		this.shenghe = shenghe;
	}

	public Integer getSl() {
		return sl;
	}

	public void setSl(Integer sl) {
		this.sl = sl;
	}

	public String getDetime() {
		return detime;
	}

	public void setDetime(String detime) {
		this.detime = detime;
	}

	public purchrvo(String odd, String deliverytime, String detime) {
		super();
		this.odd = odd;
		this.deliverytime = deliverytime;
		this.detime = detime;
	}

	public purchrvo(String odd, String deliverytime, String detime, String userid) {
		super();
		this.odd = odd;
		this.deliverytime = deliverytime;
		this.detime = detime;
		this.userid = userid;
	}

	public purchrvo() {
		super();
	}
    
}
