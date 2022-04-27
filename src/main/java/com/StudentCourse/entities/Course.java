package com.StudentCourse.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {

	@Id
	private int cid;
	private String courseName;
	
	
	
	
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int cid, String courseName) {
		super();
		this.cid = cid;
		this.courseName = courseName;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", courseName=" + courseName + "]";
	}
	
	
}
