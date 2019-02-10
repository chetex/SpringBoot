package com.examplejpa.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examplejpa.objects.Car;

@Service
public class CarService {

	@Autowired
	public CarRepository carRepository;

	/**
	 * CRUD -> Get all cars from database using crud repository
	 * @return
	 */
	public List<Car> getAllCars(){
		List<Car> list2Return = new ArrayList<Car>();
		carRepository.findAll().forEach(car -> {
			list2Return.add(car);
		});
		return list2Return;
	}
	
	/**
	 * Get specific car given ID
	 * 
	 * @param id
	 * @return
	 */
	public Car getSpecificCar(Integer id) {
		Optional<Car> optionalCar = carRepository.findById(id);
		return optionalCar.get();
	}
}