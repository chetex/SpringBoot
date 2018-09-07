package com.examplejpa.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examplejpa.objects.Car;

@RestController
@RequestMapping("/demo")
public class CarController implements CarControllerInterface {

	@GetMapping("/getallcars")
	@Override
	public List<Car> getAllCars() {
		// TODO Auto-generated method stub
		return null;
	}

	@GetMapping("/getspecificcar")
	@Override
	public Car getSpecificCar(@PathVariable int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addCar(@RequestBody Car car) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCar(Car car) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCar(Car car) {
		// TODO Auto-generated method stub
		
	}

	
}