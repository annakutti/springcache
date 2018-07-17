/**
 * 
 */
package com.sanya.caching.springcache.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sanya.caching.springcache.model.Course;
import com.sanya.caching.springcache.service.CourseService;

/**
 * @author Sanya_s
 *
 */
@RestController
public class CourseController {
	
	/**
	 * The course service
	 */
	@Autowired
	CourseService courseService;
	
	/**
	 * The get courses methos that retrieves the list of courses
	 */
	@GetMapping("/courses")
	public List<Course> getCourses(){
		System.out.println("In Course Controller");
		return courseService.getCourses();
	}

	@PostMapping("/courses/add")
	public String addCourse(@RequestBody final Course newCourse){
		System.out.println("Add new course---");
		return courseService.addCourse(newCourse);
	}
}
