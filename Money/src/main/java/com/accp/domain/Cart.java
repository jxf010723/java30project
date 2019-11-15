package com.accp.domain;

import java.util.Date;

public class Cart {
    private Integer cid;

    private Integer gid;

    private Integer gdid;

    private Integer userid;

    private String orderName;

    private String orderPhone;

    private Integer orderCount;

    private Double orderTotalmoney;

    private Double orderSfmoney;

    private Double integralDeductionmoney;

    private String orderPayment;

    private Date orderDate;

    private Integer integral;

    private Integer status;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getGdid() {
        return gdid;
    }

    public void setGdid(Integer gdid) {
        this.gdid = gdid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getOrderPhone() {
        return orderPhone;
    }

    public void setOrderPhone(String orderPhone) {
        this.orderPhone = orderPhone;
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

    public String getOrderPayment() {
        return orderPayment;
    }

    public void setOrderPayment(String orderPayment) {
        this.orderPayment = orderPayment;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}