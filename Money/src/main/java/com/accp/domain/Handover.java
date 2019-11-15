package com.accp.domain;

import java.util.Date;

public class Handover {
    private Integer handoverid;

    private Date time;

    private Integer count;

    private Float moneyamt;

    private Float price;

    private Float recharge;

    private Float balance;

    private Float refund;

    private Float actualreceipts;

    public Integer getHandoverid() {
        return handoverid;
    }

    public void setHandoverid(Integer handoverid) {
        this.handoverid = handoverid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Float getMoneyamt() {
        return moneyamt;
    }

    public void setMoneyamt(Float moneyamt) {
        this.moneyamt = moneyamt;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getRecharge() {
        return recharge;
    }

    public void setRecharge(Float recharge) {
        this.recharge = recharge;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    public Float getRefund() {
        return refund;
    }

    public void setRefund(Float refund) {
        this.refund = refund;
    }

    public Float getActualreceipts() {
        return actualreceipts;
    }

    public void setActualreceipts(Float actualreceipts) {
        this.actualreceipts = actualreceipts;
    }
}