package com.wikse.app.helper;

import java.util.ArrayList;
import java.util.List;

import com.wikse.app.bo.Product;
import com.wikse.app.bo.User;

public class DataBaseHelper {

	private static List<Product> products=null;
	private static List<User> users=null;
	
	public static List<Product> getListProducts(){
		if (products == null) {
			fillList();
		}
		return products;
	}
	
	private static void fillList(){
		products= new ArrayList<Product>();
		products.add(new Product(1,"teclado",100,200.0));
		products.add(new Product(2,"monitor",100,5000.));
		products.add(new Product(3,"mouse",100,100.0));
		products.add(new Product(4,"notebook",100,12000.0));
		products.add(new Product(5,"netbook",100,1000.0));
		products.add(new Product(6,"joystick",100,600.0));
	}

	public static List<User> getListUsers() {
		if (users == null) {
			fillUserList();
		}
		return users;
	}

	private static void fillUserList() {
		users= new ArrayList<>();
		users.add(new User(2, "moni", "65985236", "moni@email.com", "987654"));
		users.add(new User(3, "toto", "87542115", "toto@email.com", "45678"));
		users.add(new User(4, "manolo", "98567458", "manolo@email.com", "12345"));
		
	}

	public static void setListUsers(List<User> users2) {
		users = users2;
	}

	public static User getUserById(int i) {
		for (User u : DataBaseHelper.getListUsers()) {
			if (u.getIdUser()==i) {
				return u;
			}
		}
		return null;
	}
}
