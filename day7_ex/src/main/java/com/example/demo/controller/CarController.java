package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Car;
import com.example.demo.service.CarService;

@RestController
public class CarController {
	@Autowired
	CarService ser;
	
	@PostMapping("add")
	public boolean add(@RequestBody Car c) {
		return ser.add(c);
	}
	
	@GetMapping("show")
	public List<Car> show(){
		return ser.show();
	}
	
	@GetMapping("show/owners/{ownerno}")
	public List<Car> showowners(@PathVariable int ownerno){
		return ser.showowners(ownerno);
	}
	
	@GetMapping("show/address/{add}")
	public List<Car> showaddress(@PathVariable String add){
		return ser.showaddress(add);
	}
	
	@GetMapping("show/carname/{carname}")
	public List<Car> showcarname(@PathVariable String carname){
		return ser.showcarname(carname);
	}
	
	@GetMapping("show/owners{owners}/cartype{cartype}")
	public List<Car> showcarnameandcartype(@PathVariable int owners, @PathVariable String cartype){
		return ser.showownerandcartype(owners, cartype);
	}
}
