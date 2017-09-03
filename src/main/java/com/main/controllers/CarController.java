package com.main.controllers;


import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.entity.Car;
import com.main.repo.CarRepo;

@RestController
public class CarController {
	
	@Autowired
	CarRepo carRepo;
	
	@RequestMapping(value = "/cars", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	@CrossOrigin
	@Transactional
	public List<Car> getCars() {
		return carRepo.findAll();
	}
	
	@RequestMapping(value = "/car", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@CrossOrigin
	@Transactional
	public void addCar(@RequestBody Car car) {
		carRepo.save(car);
	}
	
	@RequestMapping(value = "/car", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	@CrossOrigin
	@Transactional
	public void updateCar(@RequestBody Car car) {
		System.out.println(car.toString());
		carRepo.saveAndFlush(car);
	}
	
	@RequestMapping(value="/car", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@CrossOrigin
	@Transactional
	public void deleteCar(@RequestBody Car car) {
		System.out.println(car);
		carRepo.delete(car);
	}
	
	
}
