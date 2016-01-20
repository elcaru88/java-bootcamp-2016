package com.wikse.app.bo;

public class Product {
	
	private int id_product;
	private String name;
	private int stock;
	private double salePrice;
	
	public Product(int id_product, String name, int stock, double salePrice) {
		this.id_product=id_product;
		this.name= name;
		this.stock=stock;
		this.salePrice=salePrice;
	}
	public int getId_product() {
		return id_product;
	}
	public void setId_product(int id_product) {
		this.id_product = id_product;
	}
	
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}
	
	@Override
	public String toString() {
		return name+": "+stock;
	}
	

}
