package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.model.Response;
import com.example.demo.repository.UserRepository;
@Service
public class UserService {

	
	@Autowired
	UserRepository userRepository;
	
	public Response<User> createUser(User user) {
		
		Response<User> response = new Response<User>();	
		
		User newUser = userRepository.save(user);
		response.setMessage("User added");
		response.setStatuscode(200);
		response.setData(newUser);
		
		return response;
		
	}
/*
	public Response<User> gelAllUsers() {
		
		Response<List<User>> response = new Response<User>();
		List<User> users = userRepository.findAll();
		 
		response.setMessage("User data fetched");
		response.setStatuscode(200);
	//	response.setData(users);
		return response;
	}
*/
}
