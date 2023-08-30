package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Bike;

@Repository
public interface BikeRepo extends JpaRepository<Bike, Integer>{
	@Query(value = "select * from bike where year=:s", nativeQuery = true)
	public List<Bike> readbyyearquery(@Param("s") int year);
	
	@Query(value = "select * from bike where bike_name=:s", nativeQuery = true)
	public List<Bike> readbybikenamequery(@Param("s") String bikename);
	
	@Query(value = "select * from bike where year=:s and bike_name=:n", nativeQuery = true)
	public List<Bike> readbybikenameandyearquery(@Param("s")int year, @Param("n") String bikeName);
}
