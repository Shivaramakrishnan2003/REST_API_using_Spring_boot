package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Car;

public interface CarRepo extends JpaRepository<Car, Integer>{
	@Query(value = "select * from car where owners=:s", nativeQuery = true)
	public List<Car> readbyownersquery(@Param("s") int ownerno);
	
	@Query(value = "select * from car where address=:a", nativeQuery = true)
	public List<Car> readbyaddressquery(@Param("a") String address);
	
	@Query(value = "select * from car where car_name=:c", nativeQuery = true)
	public List<Car> readbycarnamequery(@Param("c") String carname);
	
	@Query(value = "select * from car where owners=:o and car_type=:t", nativeQuery = true)
	public List<Car> readbyownerandtype(@Param("o") int owners, @Param("t") String cartype);
}
