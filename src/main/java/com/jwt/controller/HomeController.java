package com.jwt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.entities.User;
import com.jwt.service.UserService;

@RestController
public class HomeController {

@Autowired
private UserService userService;	
	
	
	
	 @GetMapping("/test")
	    public List<User> test() {
	       System.out.println("Getting Users");
	        return userService.getUsers();
	    }

}
