package com.examplejpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examplejpa.objects.Car;
import com.examplejpa.service.CarService;

@RestController
@RequestMapping("/main")
public class CarMaintenanceController {
	
	@Autowired
	public CarService carService;

	@GetMapping("/cars")
	public List<Car> getAllCars() {
		return carService.getAllCars();
	}
	
	@GetMapping("/car/{id}")
	public Car getSpecificCar(@PathVariable Integer id) {
		return carService.getSpecificCar(id);
	}
}
