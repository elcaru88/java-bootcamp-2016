package com.finalprojectV3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.finalprojectV3.model.User;
import com.finalprojectV3.service.UserServiceImp;

@RestController
@RequestMapping("/user")
public class UserController {
	
	
	Boolean check;
	
	@Autowired
	private UserServiceImp userService;

	
	@RequestMapping(value = "/create", method = RequestMethod.POST,produces={"application/json"})
	public ResponseEntity<?> createUser(@RequestBody User user) {
		userService.addEntity(user);
		return null;
	}
	
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces={"application/json"})
	public ResponseEntity<User> getUser(@PathVariable int id) {
		 User response = userService.getEntity(id);
		 System.out.println(id);
		 return new ResponseEntity<User>(response, HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	 public List<User> listStudents(){
		List<User> users = userService.getEntities(); 
		return users;
	 }
	
	@RequestMapping(value = "/login", method = RequestMethod.POST,produces={"application/json"})
	public boolean loginUser(@RequestBody User user) {
		check=false;
		List<User> users=listStudents();
		for (User iterable : users) {
			if (iterable.getUsername().equals(user.getUsername())==true &&
				iterable.getPassword().equals(user.getPassword())==true) {
				System.out.println("Login successful");
				check=true;
				}
		}
		
		if (check==false) {
			System.out.println("Login not passed");
		}		
		return check;
	}
}
