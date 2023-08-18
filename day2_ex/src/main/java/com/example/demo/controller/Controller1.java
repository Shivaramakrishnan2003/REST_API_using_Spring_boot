package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class Controller1 {
	@Value("${s}")
	private String name;
	@GetMapping("/display")
	public String display() {
		return name;
	}
}
