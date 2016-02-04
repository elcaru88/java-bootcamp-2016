package com.finalproject.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class ShoppingCart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private long idShoppingCart;
	@ManyToOne
    @JoinColumn(name="nickName")
    private User user;
	@ManyToMany
	public List<Product> products;
	
	public long getIdShoppingCart() {
		return idShoppingCart;
	}
	public void setIdShoppingCart(int idShoppingCart) {
		this.idShoppingCart = idShoppingCart;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	public ShoppingCart() {
		products = new ArrayList<Product>();
		
	}

	public ShoppingCart(User user) {
	
		this.user = user;

	}
	
}
