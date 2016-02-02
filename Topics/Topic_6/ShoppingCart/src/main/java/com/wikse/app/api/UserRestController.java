package com.wikse.app.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wikse.app.bo.Product;
import com.wikse.app.bo.User;
import com.wikse.app.services.ServiceShoppingCart;
import com.wikse.app.services.ServiceUser;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

@Api(value="users", description="Api for users")
@RestController
@RequestMapping("/users")
public class UserRestController {
	
	@Autowired
	private ServiceShoppingCart cartService;
	@Autowired
	private ServiceUser userService;

	@ApiOperation(value="Get user by id", response= User.class, notes="Returns the user, searching it for id")
	@RequestMapping(value="/{idUser}",method=RequestMethod.GET)
	public User getUserById(@PathVariable int idUser) {
		return userService.getUserById(idUser);
	}

	@ApiOperation(value="Update user", response= User.class, notes="Update user and returns the user updated")
	@RequestMapping(value="/update",method= RequestMethod.POST )
	public User updateUser(@RequestBody User userUpdate) {
		return userService.updateUser(userUpdate);
	}

	@ApiOperation(value="Delete user", response= User.class, notes="Delete user and returns the user Deleted")
	@RequestMapping(value="/{id}/delete",method= RequestMethod.GET)
	public User deleteUser(@PathVariable int idUser) {
		return userService.deleteUser(idUser);
	}

	@ApiOperation(value="Add user", response= User.class, notes="Add a new user and returns the user created")
	@RequestMapping(value="/add",method=RequestMethod.PUT)
	public User addNewUser(@RequestBody User user) {
		return userService.addNewUser(user);
	}

	@ApiOperation(value="Close purchase", response= List.class, notes="Close purchase  of user and returns the list of products")
	@RequestMapping(value="/purchase/close",method=RequestMethod.GET)
	public List<Product> closingPurchase() {
		return cartService.closingPurchase();
	}
	
	@ApiOperation(value="Add producto to List", response= Product.class, notes="Add producto to  shopping list and returns the product added")
	@RequestMapping(value="/purchase/cart/{name}/{stock}/add",method=RequestMethod.GET)
	public Product addToCartByName(@PathVariable String name, @PathVariable int stock) {
		return cartService.addToCartByName(name, stock);
	}

}
