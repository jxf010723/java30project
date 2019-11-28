package com.accp.domain;

public class OrderDetails {
    private Integer orderDetailsId;

    private String orderId;

    private Integer gdid;

    private String goodsName;

    private Double goodsPrice;

    private Integer goodsCount;

    private Double orderDetailsDiscount;

    public Integer getOrderDetailsId() {
        return orderDetailsId;
    }

    public void setOrderDetailsId(Integer orderDetailsId) {
        this.orderDetailsId = orderDetailsId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getgdid() {
        return gdid;
    }

    public void setgdid(Integer gdid) {
        this.gdid = gdid;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Integer getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(Integer goodsCount) {
        this.goodsCount = goodsCount;
    }

    public Double getOrderDetailsDiscount() {
        return orderDetailsDiscount;
    }

    public void setOrderDetailsDiscount(Double orderDetailsDiscount) {
        this.orderDetailsDiscount = orderDetailsDiscount;
    }
}