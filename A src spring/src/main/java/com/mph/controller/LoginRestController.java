package com.mph.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mph.entity.Login;
 
import com.mph.service.LoginService;


@RestController
@RequestMapping("/login")
@CrossOrigin(allowCredentials = "false",allowedHeaders =  "*"  ,origins = "http://localhost:4200",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE} )

public class LoginRestController {
	@Autowired
	public LoginService loginService;
	
	@PostMapping("/createLogin")
	public Login createLogin(@RequestBody Login login) {
		loginService.createLogin(login);
		return login;
	}

}
