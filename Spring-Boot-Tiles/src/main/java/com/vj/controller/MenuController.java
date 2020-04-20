package com.vj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/tiles")
public class MenuController {
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String getHome() {
		return "home";
	}

	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public String getContact() {
		return "contact";
	}

	@RequestMapping(value = "/java", method = RequestMethod.GET)
	public String getJava() {
		return "java";
	}

	@RequestMapping(value = "/featureOfJava")
	public String getFeatureOfJava() {
		return "featureOfJava";
	}

	
	
	
	@RequestMapping(value = "/whtjsp")
	public String getWhtJsp() {
		return "whtjsp";
	}

	@RequestMapping(value = "/whtHiberNate")
	public String getwhtHiberNate() {
		return "whtHiberNate";
	}

	@RequestMapping(value = "/whtSpring")
	public String getwhtSpring() {
		return "whtSpring";
	}

	@RequestMapping(value = "/whtSpringBoot")
	public String getwhtSpringBoot() {
		return "whtSpringBoot";
	}

	@RequestMapping(value = "/whtSpringDataJPA")
	public String whtSpringDataJPA() {
		return "whtSpringDataJPA";
	}

	@RequestMapping(value = "/whtSpringCloud")
	public String getwhtSpringCloud() {
		return "whtSpringCloud";
	}

	@RequestMapping(value = "/whtMicroServices")
	public String getwhtMicroServices() {
		return "whtMicroServices";
	}
}
