package com.capgemini.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.capgemini.ems.service.IAuthenticationService;


@Controller
public class LoginController {

	@Autowired
	private IAuthenticationService authenticationService;
}
