package com.example.demo.ldap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	
	@RequestMapping("/user")
	public String hello() {
		return "<h1>Hello ldap</h1>";
	}
}
