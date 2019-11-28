package com.accp.domain;

import java.util.Date;
import java.util.List;

public class Purchase {
    private Integer purchaseid;

    private String odd;

    private Date deliverytime;

    private Integer supplierid;

    private Integer userid;

    private String remarks;

    private Float grossmoney;
    
    private Integer shenghe;
    
    private Integer sl;
    
    private String suppliername;
    private String uname;
    
    private String remark1;

    private Integer goodscount;
    
    private double goodCostprice;
    public String getRemark1() {
		return remark1;
	}

	public void setRemark1(String remark1) {
		this.remark1 = remark1;
	}

	public Integer getGoodscount() {
		return goodscount;
	}

	public void setGoodscount(Integer goodscount) {
		this.goodscount = goodscount;
	}

	public double getGoodCostprice() {
		return goodCostprice;
	}

	public void setGoodCostprice(double goodCostprice) {
		this.goodCostprice = goodCostprice;
	}

	private List<Purchasedetails> purchasezi;
    
    
    
    public List<Purchasedetails> getPurchasezi() {
		return purchasezi;
	}

	public void setPurchasezi(List<Purchasedetails> purchasezi) {
		this.purchasezi = purchasezi;
	}

	public String getSuppliername() {
		return suppliername;
	}

	public void setSuppliername(String suppliername) {
		this.suppliername = suppliername;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public Integer getPurchaseid() {
        return purchaseid;
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