package com.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.finalproject.model.Product;
import com.finalproject.service.ProductService;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

	@Autowired
	ProductService productService;

		

	@RequestMapping(value = "/findByName/{name}", method = RequestMethod.GET)
	public Product getProductByName(@PathVariable("name") String name) {
		return productService.getProductByName(name);

	}

	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public void createProduct(@RequestBody Product product) {
		this.productService.createProduct(product);

	}

	
	@RequestMapping(value = "/findByCategory/{category}", method = RequestMethod.GET)
	public List<Product> getProductByCategory(@PathVariable("category") String category) {
		return productService.getProductByCategory(category);

	}

}