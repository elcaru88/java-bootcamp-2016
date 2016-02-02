package com.wikse.app.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;



@ApiModel(value="User Entity", description="Complete info of Entity User")
@Entity
public class User {
	@ApiModelProperty(value="the User's id")
	@Id
	@GeneratedValue
	private Integer idUser;
	
	@ApiModelProperty(value="the User's name")
	private String nameUser;
	
	@ApiModelProperty(value="the User's DNI")
	private String dni;
	
	@ApiModelProperty(value="the User's email")
	private String email;
	
	@JsonIgnore
	@ApiModelProperty(value="the product's password")
	private String password;
	
	@ApiModelProperty(value="A list of shopping carts closed")
	@OneToMany
	private List<Cart> carts_Closed;
	
	@ApiModelProperty(value="A shopping cart open to buy")
	@OneToOne
	private Cart shoppingCart;

	
	public User() {
		idUser=0;
	}
	public Integer getIdUser() {
		return idUser;
	}
	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}
	public String getNameUser() {
		return nameUser;
	}
	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Cart> getCarts_Closed() {
		return carts_Closed;
	}
	public void setCarts_Closed(List<Cart> carts_Closed) {
		this.carts_Closed = carts_Closed;
	}
	public Cart getShoppingCart() {
		return shoppingCart;
	}
	public void setShoppingCart(Cart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

	
	@Override
	public String toString() {
		StringBuffer sb=new StringBuffer("Nombre: ");
		sb.append(this.nameUser);
		sb.append(" emial:");
		sb.append(this.email);
		sb.append(" DNI:");
		sb.append(this.dni);
		return sb.toString();
	}
	
}
