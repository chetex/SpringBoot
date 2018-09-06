package com.demo.jpa.course;

import java.util.List;

public interface CourseInterface {
	public List<Course> getAllCourses(int id);
	public Course getCourse(int id);
	public void addCourse(Course course);
	public void updateCourse(Course course);
	public void deleteCourse(int id);
}
