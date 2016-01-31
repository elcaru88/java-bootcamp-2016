package com.wikse.app.api;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wikse.app.bo.Product;
import com.wikse.app.bo.User;
import com.wikse.app.helper.DataBaseHelper;
import com.wikse.app.services.ServiceShoppingCart;
import com.wikse.app.services.ServiceUser;

@RestController
@RequestMapping("/users")
public class UserRestController implements ServiceShoppingCart,ServiceUser {

	@Override
	@RequestMapping(value="{/idUser}",method=RequestMethod.GET)
	public User getUserById(@PathVariable int idUser) {
		User user=DataBaseHelper.getUserById(idUser);
		if (user==null) {
			user=new User();
			user.setIdUser(0);
		}
		return user;
	}

	@Override
	public boolean updateUser(User userUpdate) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser(User userDelete) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addNewUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Product> closingPurchase() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addToCartByName(String string, int i) {
		// TODO Auto-generated method stub
		return false;
	}

}
