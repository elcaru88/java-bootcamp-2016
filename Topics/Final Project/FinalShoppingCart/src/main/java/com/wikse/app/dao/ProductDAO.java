package com.wikse.app.dao;

import java.util.List;

import com.wikse.app.entities.Category;
import com.wikse.app.entities.Product;
/**
 * Manages all the data from database about Products.
 * @author Emanuel
 * @version 1.0
 * @since 2016-01-19
 */
public interface ProductDAO extends GenericDAO<Product, Integer>{

	Product getByName(String name);
//	/**
//	 * returns all the products of a database.
//	 * @return List<Product>
//	 */
//	List<Product> getAllProducts();
//	
//	/**
//	 * returns a product search by id.
//	 * @param id_product product id you want to search
//	 * @return the product or a null if not
//	 */
//	Product getProduct(int id_product);
//	
//	/**
//	 * returns a product, searched by product's name.
//	 * @param nameProduct product's name
//	 * @return the product or a null if
//	 */
//	Product getProductByName(String nameProduct);
//	
//	/**
//	 * returns a products' list, searching it by category
//	 * @return
//	 */
//	List<Product> getProductosByCategory();

	List<Product> getByCategory(Category category);
}
