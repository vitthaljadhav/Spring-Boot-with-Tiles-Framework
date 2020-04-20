package com.vj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/tiles")
public class WelcomeController {
	@RequestMapping(value = "/welcome")
	public String showTiles() {
		return "welcome";
	}
}
