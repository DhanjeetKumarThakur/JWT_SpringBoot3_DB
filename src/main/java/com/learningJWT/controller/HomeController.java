package com.learningJWT.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learningJWT.entity.User;
import com.learningJWT.services.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/users")
	public List<User> getUser() {
		//System.out.println("getting user");
		return this.userService.getStore();
	}
	
	@GetMapping("/current-user")
	public String getLoggedInUser(Principal principal) {
		System.out.println(principal.getName());
		return principal.getName();
	}
}
