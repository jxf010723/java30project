package com.accp.domain;

public class zongjivo {
	private Integer stock;
	private float salesprice;
	private float costprice;
	public Integer getStock() {
		return stock;
	}
	
	@Override
	public String toString() {
		return "zongjivo [stock=" + stock + ", salesprice=" + salesprice + ", costprice=" + costprice + "]";
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public float getSalesprice() {
		return salesprice;
	}
	public void setSalesprice(float salesprice) {
		this.salesprice = salesprice;
	}
	public float getCostprice() {
		return costprice;
	}
	public void setCostprice(float costprice) {
		this.costprice = costprice;
	}
	
}
