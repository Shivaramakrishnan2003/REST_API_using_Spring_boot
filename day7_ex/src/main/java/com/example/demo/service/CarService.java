package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Car;
import com.example.demo.repository.CarRepo;

@Service
public class CarService {
	@Autowired
	CarRepo c;
	
	public boolean add(@RequestBody Car cr) {
		c.save(cr);
		return true;
	}
	
	public List<Car> show() {
		return c.findAll();
	}
	
	public List<Car> showowners(int owners){
		return c.readbyownersquery(owners);
	}
	
	public List<Car> showaddress(String add){
		return c.readbyaddressquery(add);
	}
	
	public List<Car> showcarname(String carname){
		return c.readbycarnamequery(carname);
	}
	
	public List<Car> showownerandcartype(int id, String cartype){
		return c.readbyownerandtype(id, cartype);
	}
}
