package com.accp.domain;

import java.util.Date;

public class Cart {
    private Integer cid;

    private Integer gid;

    private Integer gdid;

    private Integer vipid;

    private String color;

    private Integer goodssize;

    private Integer orderCount;

    private Double orderTotalmoney;

    private Double orderSfmoney;

    private Date orderDate;

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

    public Integer getVipid() {
        return vipid;
    }

    public void setVipid(Integer vipid) {
        this.vipid = vipid;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getGoodssize() {
        return goodssize;
    }

    public void setGoodssize(Integer goodssize) {
        this.goodssize = goodssize;
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