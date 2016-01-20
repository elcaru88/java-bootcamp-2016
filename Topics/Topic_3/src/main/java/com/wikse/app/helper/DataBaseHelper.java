package com.wikse.app.helper;

import java.util.ArrayList;
import java.util.List;

import com.wikse.app.bo.Product;

public class DataBaseHelper {

	private static List<Product> products=null;
	
	
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
}
