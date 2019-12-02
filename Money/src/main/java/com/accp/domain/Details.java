package com.accp.domain;

public class Details {
    private Integer detailsid;

    private String goodsid;

    

    private String goodssize;

    private String color;


    private String shapecode;

    private Integer count;
    
    private String bianhao;

	public String getBianhao() {
		return bianhao;
	}

	public void setBianhao(String bianhao) {
		this.bianhao = bianhao;
	}

	public Integer getDetailsid() {
		return detailsid;
	}

	public void setDetailsid(Integer detailsid) {
		this.detailsid = detailsid;
	}

	public String getGoodsid() {
		return goodsid;
	}

	public void setGoodsid(String goodsid) {
		this.goodsid = goodsid;
	}

	public String getGoodssize() {
		return goodssize;
	}

	public void setGoodssize(String goodssize) {
		this.goodssize = goodssize;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getShapecode() {
		return shapecode;
	}

	public void setShapecode(String shapecode) {
		this.shapecode = shapecode;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Details [detailsid=" + detailsid + ", goodsid=" + goodsid + ", goodssize=" + goodssize + ", color="
				+ color + ", shapecode=" + shapecode + ", count=" + count + "]";
	}

	
	
	
}