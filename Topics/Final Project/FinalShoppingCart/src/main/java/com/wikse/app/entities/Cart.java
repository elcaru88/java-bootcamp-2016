package com.wikse.app.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.wordnik.swagger.annotations.ApiModel;

@ApiModel(value="User Entity", description="Complete info of Entity User")
@Entity
public class Cart {
	@Id
	@GeneratedValue
	private Integer id_cart;
	@ManyToOne
	private User user;
	private Date date_bought;
	private boolean isclose;
	@OneToMany
	private List<Product> products;
	
	public Integer getId_cart() {
		return id_cart;
	}
	public void setId_cart(Integer id_cart) {
		this.id_cart = id_cart;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Date getDate_bought() {
		return date_bought;
	}
	public void setDate_bought(Date date_bought) {
		this.date_bought = date_bought;
	}
	public boolean isIsclose() {
		return isclose;
	}
	public void setIsclose(boolean isclose) {
		this.isclose = isclose;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	
	
}
