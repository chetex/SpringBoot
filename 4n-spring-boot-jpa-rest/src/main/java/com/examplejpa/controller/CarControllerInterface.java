package com.examplejpa.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.examplejpa.objects.Car;

public interface CarControllerInterface {
	public List<Car> getAllCars();
	public Car getSpecificCar(@PathVariable int id);
	public void addCar(Car car);
	public void updateCar(Car car);
	public void deleteCar(Car car);
}