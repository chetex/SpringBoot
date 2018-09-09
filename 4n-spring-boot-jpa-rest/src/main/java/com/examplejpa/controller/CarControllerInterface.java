package com.examplejpa.controller;

import java.util.List;

import com.examplejpa.objects.Car;

public interface CarControllerInterface {
	public List<Car> getAllCars();
	public Car getSpecificCar(int id);
	public void addCar(Car car);
	public void updateCar(Car car);
	public void deleteCar(Car car);
}