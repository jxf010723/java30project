package com.accp.domain;

public class Purchasedetails {
    private Integer purchasedetailsid;

    private String ltemno;

    private Integer purchaseid;

    private String shapecode;

    private String goodsname;

    private String goodsphoto;

    private String specification;

    private Float costprice;

    private Float count;

    private Float money;

    public Integer getPurchasedetailsid() {
        return purchasedetailsid;
    }

    public void setPurchasedetailsid(Integer purchasedetailsid) {
        this.purchasedetailsid = purchasedetailsid;
    }

    public String getLtemno() {
        return ltemno;
    }

    public void setLtemno(String ltemno) {
        this.ltemno = ltemno;
    }

    public Integer getPurchaseid() {
        return purchaseid;
    }

    public void setPurchaseid(Integer purchaseid) {
        this.purchaseid = purchaseid;
    }

    public String getShapecode() {
        return shapecode;
    }

    public void setShapecode(String shapecode) {
        this.shapecode = shapecode;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public String getGoodsphoto() {
        return goodsphoto;
    }

    public void setGoodsphoto(String goodsphoto) {
        this.goodsphoto = goodsphoto;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public Float getCostprice() {
        return costprice;
    }

    public void setCostprice(Float costprice) {
        this.costprice = costprice;
    }

    public Float getCount() {
        return count;
    }

    public void setCount(Float count) {
        this.count = count;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }
}