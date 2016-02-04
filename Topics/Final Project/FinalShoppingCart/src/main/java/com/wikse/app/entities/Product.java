package com.wikse.app.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

@ApiModel(value= "Producto Entity", description="Complete info of a Entity Product")
@Entity
public class Product {
	
	
	@ApiModelProperty(value="the product's id")
	@Id
	@GeneratedValue
	private Integer id_product;
	
	@ApiModelProperty(value="the product's name")
	private String name;
	
	@ApiModelProperty(value="the product's stock")
	private int stock;
	
	@ApiModelProperty(value="the product's price")
	private double salePrice;
	
	@ApiModelProperty(value="the product's category")
	@ManyToOne(fetch=FetchType.EAGER)
//	@JsonIgnore
	private Category category;
	
	
	public Product() {}
	
	public Integer getId_product() {
		return id_product;
	}
	public void setId_product(Integer id_product) {
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
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	

}
