package com.accp.domain;

import java.util.Date;

public class Order {
    private Integer orderId;

    private Integer userId;

    private String orderName;

    private String orderPhone;

    private Integer orderCount;

    private Double orderTotalmoney;

    private Double orderSfmoney;

    private Double integralDeductionmoney;

    private String orderPayment;

    private Date orderDate;

    private Integer integral;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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
}