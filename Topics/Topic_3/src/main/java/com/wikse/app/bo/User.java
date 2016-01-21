package com.wikse.app.bo;

public class User {
	private int idUser;
	private String nameUser;
	private String dni;
	private String email;
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
