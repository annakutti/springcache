/**
 * 
 */
package com.sanya.caching.springcache.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Sanya_s
 *
 */
@Entity
public class Course {

	/**
	 * The course Id
	 */
	@Id
	@GeneratedValue
	private int courseId;
	
	/**
	 * The courseName
	 */
	private String couserName;
	
	/**
	 * The course description
	 */
	private String description;

	/**
	 * 
	 */
	public Course() {
		super();
	}

	/**
	 * @param courseId
	 * @param couserName
	 * @param description
	 */
	public Course(int courseId, String couserName, String description) {
		super();
		this.courseId = courseId;
		this.couserName = couserName;
		this.description = description;
	}

	/**
	 * @return the courseId
	 */
	public int getCourseId() {
		return courseId;
	}

	/**
	 * @param courseId the courseId to set
	 */
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	/**
	 * @return the couserName
	 */
	public String getCouserName() {
		return couserName;
	}

	/**
	 * @param couserName the couserName to set
	 */
	public void setCouserName(String couserName) {
		this.couserName = couserName;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
