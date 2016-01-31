package com.wikse.app.tryout;

import java.util.List;

import com.wikse.app.bo.Product;
import com.wikse.app.bo.User;
import com.wikse.app.services.ServiceShoppingCart;
import com.wikse.app.services.ServiceUser;
import com.wikse.app.services.impl.ServiceShoppingCartImpl;
import com.wikse.app.services.impl.ServiceUserImpl;

public class Main {

	public static void main(String[] args) {
		ServiceShoppingCart service= new ServiceShoppingCartImpl();
		service.addToCartByName("notebook", 1);
		service.addToCartByName("monitor", 1);
		service.addToCartByName("mouse", 1);
		service.addToCartByName("teclado", 1);
		List<Product> boughtProducts=service.closingPurchase();
		System.out.println(boughtProducts.size());
		for (Product product : boughtProducts) {
			System.out.println(product.toString());
		}
		
		
		//user CRUD
		
		//cread
		ServiceUser serviceUser= new ServiceUserImpl();
		User user= new User(1, "pepe", "25878459", "pepe@email.com","1234");
		serviceUser.addNewUser(user);
		
		//Read
		User userRead=serviceUser.getUserById(2);
		System.out.println(userRead.toString());
		
		//Update
		User userUpdate=serviceUser.getUserById(3);
		userUpdate.setEmail("pepe123@email.com");
		serviceUser.updateUser(userUpdate);
		
		//Delete
		User userDelete=serviceUser.getUserById(4);
		serviceUser.deleteUser(userDelete);
		
	}

}
