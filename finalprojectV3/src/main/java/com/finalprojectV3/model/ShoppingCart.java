package com.finalprojectV3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cart")
public class ShoppingCart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@Column(name = "cartid")
	private int cartid;
		
	@Column(name = "productid")
	private int productid;
	
	@Column(name = "productquantity")
	private int productquantity;
		
	
	public ShoppingCart() {
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", productid=" + productid + ", cantity=" + productquantity + ", cartid=" + cartid + "]";
	}
	
	public ShoppingCart(int productid, int productquantity, int cartid) {
		super();
		this.productid = productid;
		this.productquantity = productquantity;
		this.cartid = cartid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public int getProductquantity() {
		return productquantity;
	}

	public void setProductquantity(int cantity) {
		this.productquantity = cantity;
	}

	public int getCartid() {
		return cartid;
	}

	public void setCartid(int cartid) {
		this.cartid = cartid;
	}

	
	
	

}
