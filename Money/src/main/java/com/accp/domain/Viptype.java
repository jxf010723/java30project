package com.accp.domain;

public class Viptype {
    private Integer viptypeId;

    private String viptypeName;

    private Double viptypeDiscount;

    private Double moneylv;

    public Integer getViptypeId() {
        return viptypeId;
    }

    public void setViptypeId(Integer viptypeId) {
        this.viptypeId = viptypeId;
    }

    public String getViptypeName() {
        return viptypeName;
    }

    public void setViptypeName(String viptypeName) {
        this.viptypeName = viptypeName;
    }

    public Double getViptypeDiscount() {
        return viptypeDiscount;
    }

    public void setViptypeDiscount(Double viptypeDiscount) {
        this.viptypeDiscount = viptypeDiscount;
    }

    public Double getMoneylv() {
        return moneylv;
    }

    public void setMoneylv(Double moneylv) {
        this.moneylv = moneylv;
    }
}