package com.examplejpa;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.examplejpa.objects.Car;
import com.examplejpa.service.CarRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {
	
	@Autowired
	public CarRepository carRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		carRepository.deleteAll();
		
		carRepository.save(new Car("audi a4", new Date(), "TDI", "Blue"));
		carRepository.save(new Car("Ford sierra", new Date(), "Gasolina", "Blue"));
		
		// SELETC -------------------------
		System.out.println("Mostrar elementos actuales en base de datos");
		carRepository.findAll().forEach(car -> {
			System.out.println(car);
		});
		System.out.println();
	}
}
