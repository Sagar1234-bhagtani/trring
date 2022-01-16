package com.springrest.springrest.service;

import java.util.List;

import com.springrest.springrest.entities.Course;

public interface courseservive {
	
	public List<Course> getCourses();
	
	public Course getCourses(long courseId);
	
	public Course addCourse(Course course);
    
	public Course updateCourse(Course course);
	
	public void deletecourse(long courseId);
}