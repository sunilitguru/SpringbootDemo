package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.model.Response;
import com.example.demo.service.UserService;


@RestController
public class UserController {
    
	@Autowired
	UserService userService;
	
	@PostMapping("/adduser")
	public Response<User> addUser(@RequestBody User user) {
	
		return userService.createUser(user);
	}
/*
	@GetMapping("/getusers")
	
	public Response<List<User>> getUsers(){
		
		return userService.gelAllUsers();
	}
	*/
}
