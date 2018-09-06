package com.demo.jpa.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService implements CourseInterface {

	@Autowired
	private CourseRepository courseRepository;
	
	/**
	 * CRUD -> Get all topics from database
	 * @param id 
	 * @return
	 */
	public List<Course> getAllCourses(int id) {
		List<Course> coursesList = new ArrayList<>();
		courseRepository.findByTopicId(id);
		return coursesList;
	}
	
	/**
	 * CRUD -> Save single topic in database
	 */
	public void addCourse(Course course) {
		courseRepository.save(course);
	}
	
	/**
	 * CRUD -> Get single topic from DB
	 * 
	 * @param id
	 * @return
	 */
	public Course getCourse(int id) {
		return courseRepository.findById(id).get();
	}

	/**
	 * CRUD -> Update topic. Is the same as add, because it knows the id
	 * 
	 * @param id
	 * @param topic
	 */
	public void updateCourse(Course course) {
		courseRepository.save(course);
	}

	/**
	 * CRUD -> Delete repository
	 * 
	 * @param id
	 * @param topic
	 */
	@Override
	public void deleteCourse(int id) {
		courseRepository.deleteById(id);
	}
}