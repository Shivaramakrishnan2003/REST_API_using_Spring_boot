package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class Controller3 {
	@Value("${c}")
	private String yourFavColor;
	
	@GetMapping("/display/q3")
	public String getMyFav() {
		return "My favourite color is " + yourFavColor;
	}
}
