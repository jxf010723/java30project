package com.accp.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class RechargeDeduction {
    private Integer rdid;

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date rdDate;

    private String rdVxid;

    private String rdName;

    private Integer rdPhone;

    private Integer rdRecharge;

    private Integer rdPresentation;

    private Double rdExpenditure;

    private Double rdBalance;

    private String rdRemark;

    public Integer getRdid() {
        return rdid;
    }

    public void setRdid(Integer rdid) {
        this.rdid = rdid;
    }

    public Date getRdDate() {
        return rdDate;
    }

    public void setRdDate(Date rdDate) {
        this.rdDate = rdDate;
    }

    public String getRdVxid() {
        return rdVxid;
    }

    public void setRdVxid(String rdVxid) {
        this.rdVxid = rdVxid;
    }

    public String getRdName() {
        return rdName;
    }

    public void setRdName(String rdName) {
        this.rdName = rdName;
    }

    public Integer getRdPhone() {
        return rdPhone;
    }

    public void setRdPhone(Integer rdPhone) {
        this.rdPhone = rdPhone;
    }

    public Integer getRdRecharge() {
        return rdRecharge;
    }

    public void setRdRecharge(Integer rdRecharge) {
        this.rdRecharge = rdRecharge;
    }

    public Integer getRdPresentation() {
        return rdPresentation;
    }

    public void setRdPresentation(Integer rdPresentation) {
        this.rdPresentation = rdPresentation;
    }

    public Double getRdExpenditure() {
        return rdExpenditure;
    }

    public void setRdExpenditure(Double rdExpenditure) {
        this.rdExpenditure = rdExpenditure;
    }

    public Double getRdBalance() {
        return rdBalance;
    }

    public void setRdBalance(Double rdBalance) {
        this.rdBalance = rdBalance;
    }

    public String getRdRemark() {
        return rdRemark;
    }

    public void setRdRemark(String rdRemark) {
        this.rdRemark = rdRemark;
    }
}