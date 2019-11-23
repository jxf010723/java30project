package com.accp.domain;

public class Goods {
    private Integer goodsid;

    private Integer shopid;

    private Integer typeid;

    private Integer supplierid;

    private String goodsbrand;

    private String goodsname;

    private String goodsphoto;

    private String numbers;

    private String specification;

    private Integer stock;

    private Float salesprice;

    private Float costprice;

    private Integer agio;
    
    private String typename;
    
    private String colour;
    private String bianhao;
    
    
    public String getBianhao() {
		return bianhao;
	}

	public void setBianhao(String bianhao) {
		this.bianhao = bianhao;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Goods [goodsid=" + goodsid + ", shopid=" + shopid + ", typeid=" + typeid + ", supplierid=" + supplierid
				+ ", goodsbrand=" + goodsbrand + ", goodsname=" + goodsname + ", goodsphoto=" + goodsphoto
				+ ", numbers=" + numbers + ", specification=" + specification + ", stock=" + stock + ", salesprice="
				+ salesprice + ", costprice=" + costprice + ", agio=" + agio + ", typename=" + typename + "]";
	}

	public String getTypename() {
		return typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public String getGoodsbrand() {
        return goodsbrand;
    }

    public void setGoodsbrand(String goodsbrand) {
        this.goodsbrand = goodsbrand;
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

    public String getNumbers() {
        return numbers;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Float getSalesprice() {
        return salesprice;
    }

    public void setSalesprice(Float salesprice) {
        this.salesprice = salesprice;
    }

    public Float getCostprice() {
        return costprice;
    }

    public void setCostprice(Float costprice) {
        this.costprice = costprice;
    }

    public Integer getAgio() {
        return agio;
    }

    public void setAgio(Integer agio) {
        this.agio = agio;
    }
}