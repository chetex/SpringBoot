package com.chetex.studentmanagement;

import com.chetex.studentmanagement.entity.Student;
import com.chetex.studentmanagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * New Spring boot application student management
 */
@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	// Gets Student Entity to fill students table.
	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	/**
	 * @param args incoming main method arguments
	 * @throws Exception
	 */
	@Override
	public void run(String... args) throws Exception {

		/*
		// Fill students repository
		Student student1 = new Student("Pepe", "Garcia", "test1@gmail.com");
		studentRepository.save(student1);

		Student student12 = new Student("Pepe1", "Garcia2", "test12@gmail.com");
		studentRepository.save(student12);

		Student student13 = new Student("Pepe4", "Garcia3", "test13@gmail.com");
		studentRepository.save(student13);
		*/
	}
}