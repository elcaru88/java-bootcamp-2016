package com.wikse.app.bo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

@ApiModel(value="User Entity", description="Complete info of Entity User")
public class User {
	@ApiModelProperty(value="the User's id")
	private int idUser;
	@ApiModelProperty(value="the User's name")
	private String nameUser;
	@ApiModelProperty(value="the User's DNI")
	private String dni;
	@ApiModelProperty(value="the User's email")
	private String email;
	@JsonIgnore
	@ApiModelProperty(value="the product's password")
	private String password;
	public User(int idUser, String nameUser, String dni, String email, String password) {
		super();
		this.idUser = idUser;
		this.nameUser = nameUser;
		this.dni = dni;
		this.email = email;
		this.setPassword(password);
	}
	public User() {
		idUser=0;
	}
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
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
