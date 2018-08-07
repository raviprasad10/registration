package com.cg.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.beans.Registration;

@Controller
public class URIController {

	@RequestMapping("/")
	public String getHomePage() {
		return "index";
	}
	
	@RequestMapping("/register")
	public String getRegistrationPage() {
		return "RegistrationPage";
	}
	@RequestMapping("/success")
	public String getSuccessPage() {
		return "successPage";
	}
	@ModelAttribute("registration")
	public Registration getAccount() {
	return new Registration();
}
}