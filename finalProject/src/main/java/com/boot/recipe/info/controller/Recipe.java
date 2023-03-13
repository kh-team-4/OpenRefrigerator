package com.boot.recipe.info.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Recipe {

	@GetMapping("/")
	public String main() {
		return "main";
	}

}
