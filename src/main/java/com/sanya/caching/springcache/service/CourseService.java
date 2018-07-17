/**
 * 
 */
package com.sanya.caching.springcache.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.sanya.caching.springcache.model.Course;
import com.sanya.caching.springcache.repository.CourseRepository;

/**
 * @author Sanya_s
 *
 */
@Service
public class CourseService {

	/**
	 * The course repository
	 */
	@Autowired
	CourseRepository courseRepository;
	
	@Cacheable(value="courseId")
	public List<Course> getCourses(){
		System.out.println("In Course Service");
		return courseRepository.findAll();
	}
	
	@CacheEvict(value="courseId",allEntries=true)
	public String addCourse(Course newCourse){
		System.out.println("In course add service");
		courseRepository.save(newCourse);
		return "course Added";
	}
}
