package com.examplejpa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examplejpa.objects.Car;

@Service
public class CarService {

	@Autowired
	public CarRepository carRepository;
	

	/**
	 * CRUD -> Get all cars from database
	 * @return
	 */
	public List<Car> getAllCars(){
		List<Car> list2Return = new ArrayList<Car>();
		carRepository.findAll().forEach(car -> {
			list2Return.add(car);
		});
		return list2Return;
	}
}
