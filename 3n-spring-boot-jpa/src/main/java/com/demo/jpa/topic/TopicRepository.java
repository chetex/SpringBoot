package com.demo.jpa.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, Integer> {

	/**
	 * Crud repository gives us list of tipical topics and 
	 * most commons CRUS operations over apache derby querys.
	 */
}
