package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Bike;
import com.example.demo.service.BikeService;


@RestController
public class BikeController {
	@Autowired
	BikeService ser;
	
	@PostMapping("add")
	public boolean add(@RequestBody Bike c) {
		return ser.add(c);
	}
	
	@GetMapping("show")
	public List<Bike> show(){
		return ser.show();
	}
	
	@GetMapping("show/year/{year}")
	public List<Bike> showByYear(@PathVariable int year){
		return ser.showyear(year);
	}
	
	@GetMapping("show/bikename/{bikename}")
	public List<Bike> showByBikename(@PathVariable String bikename){
		return ser.showbikename(bikename);
	}
	
	@GetMapping("show/year/{year}/bikename/{bikename}")
	public List<Bike> showYearAndBikename(@PathVariable int year, @PathVariable String bikename){
		return ser.showyearandbikename(year, bikename);
	}
}
