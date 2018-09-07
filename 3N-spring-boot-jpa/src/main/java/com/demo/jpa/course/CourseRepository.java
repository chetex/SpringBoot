package com.demo.jpa.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Integer> {

	/**
	 * Crud repository gives us list of tipical topics and 
	 * most commons CRUS operations over apache derby querys.
	 */
	
	/**
	 * Define a method to a particular search
	 */
	public List<Course> findByName(String name);
	
	/**
	 * Define a method to a particular search
	 */
	public List<Course> findByDescription(String description);
	
	/**
	 * Find by topic id
	 */
	public List<Course> findByTopicId(int topicId);
}
