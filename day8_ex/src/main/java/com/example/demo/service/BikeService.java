package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Bike;
import com.example.demo.repository.BikeRepo;

@Service
public class BikeService {
	@Autowired
	BikeRepo b;
	
	public boolean add(Bike cr) {
		b.save(cr);
		return true;
	}
	
	public List<Bike> show() {
		return b.findAll();
	}
	
	public List<Bike> showyear(int year){
		return b.readbyyearquery(year);
	}
	
	public List<Bike> showbikename(String bikename){
		return b.readbybikenamequery(bikename);
	}
	
	public List<Bike> showyearandbikename(int year, String bikename){
		return b.readbybikenameandyearquery(year, bikename);
	}
}
