package com.wikse.app.tryout;

import java.util.List;

import com.wikse.app.bo.Product;
import com.wikse.app.services.ServiceShoppingCart;
import com.wikse.app.services.impl.ServiceShoppingCartImpl;

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
	}

}
