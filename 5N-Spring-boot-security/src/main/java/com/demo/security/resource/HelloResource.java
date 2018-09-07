package com.demo.security.resource;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class HelloResource {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello world;";
	}
	
	/**
	 * UserDetails come from Spring security layer
	 * 
	 * @param userDetails
	 * @return
	 */
	@GetMapping("/user-details")
	public String getUserDetails(@AuthenticationPrincipal final UserDetails userDetails) {
		String name = userDetails.getUsername();
		String password = userDetails.getPassword();
		return "User details " + name + " " + password;
	}
}
