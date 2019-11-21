package com.accp.domain;

import java.util.Date;

public class Cart {
    private Integer cid;

    private Integer gdid;

    private Integer userid;

    private Integer orderCount;

    private Double orderTotalmoney;

    private Double orderSfmoney;

    private Double integralDeductionmoney;

    private Date orderDate;

    private Integer status;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getgdid() {
        return gdid;
    }

    public void setgdid(Integer gdid) {
        this.gdid = gdid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    public Double getOrderTotalmoney() {
        return orderTotalmoney;
    }

    public void setOrderTotalmoney(Double orderTotalmoney) {
        this.orderTotalmoney = orderTotalmoney;
    }

    public Double getOrderSfmoney() {
        return orderSfmoney;
    }

    public void setOrderSfmoney(Double orderSfmoney) {
        this.orderSfmoney = orderSfmoney;
    }

    public Double getIntegralDeductionmoney() {
        return integralDeductionmoney;
    }

    public void setIntegralDeductionmoney(Double integralDeductionmoney) {
        this.integralDeductionmoney = integralDeductionmoney;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}