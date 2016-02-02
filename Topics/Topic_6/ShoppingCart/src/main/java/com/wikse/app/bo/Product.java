package com.wikse.app.bo;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

@ApiModel(value= "Producto Entity", description="Complete info of a Entity Product")
public class Product {
	
	@ApiModelProperty(value="the product's id")
	private int id_product;
	@ApiModelProperty(value="the product's name")
	private String name;
	@ApiModelProperty(value="the product's stock")
	private int stock;
	@ApiModelProperty(value="the product's price")
	private double salePrice;
	
	public Product(int id_product, String name, int stock, double salePrice) {
		this.id_product=id_product;
		this.name= name;
		this.stock=stock;
		this.salePrice=salePrice;
	}
	public Product() {
		// TODO Auto-generated constructor stub
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
