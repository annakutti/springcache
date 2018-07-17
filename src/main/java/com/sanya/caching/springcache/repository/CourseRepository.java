/**
 * 
 */
package com.sanya.caching.springcache.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanya.caching.springcache.model.Course;

/**
 * @author Sanya_s
 *
 */
public interface CourseRepository extends JpaRepository<Course, Integer>{

}
