package com.examplejpa.service;

import org.springframework.data.repository.CrudRepository;

import com.examplejpa.objects.Car;

public interface CarRepository extends CrudRepository<Car, Integer>{

}