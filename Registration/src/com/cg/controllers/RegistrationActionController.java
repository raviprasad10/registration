package com.cg.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.beans.Registration;
import com.cg.services.RegistrationService;

@Controller
public class RegistrationActionController {

	@Autowired
	RegistrationService service;

	@RequestMapping(value="/registerUser",method=RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute("registration") Registration registration) {

		registration =service.createAccount(registration);
		ModelAndView modelAndView = new ModelAndView("RegistrationSuccessPage", "registration", registration);
		return modelAndView;
	}



}
