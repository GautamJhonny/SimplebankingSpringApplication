package com.mph.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mph.entity.Adminlogin;
import com.mph.service.AdminloginService;



@RestController
@RequestMapping("/adminlogin")
@CrossOrigin(allowCredentials = "false",allowedHeaders =  "*"  ,origins = "http://localhost:4200",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE} )

public class AdminloginRestController {
	@Autowired
	public AdminloginService adminloginService;
	
	@PostMapping("/createAdminlogin")
	public Adminlogin createAdminlogin(@RequestBody Adminlogin adminlogin) {
		adminloginService.createAdminlogin(adminlogin);
		return adminlogin;
	}

}
