package com.StudentCourse.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Student {
	
	
	@Id 
	private int id;
	private String name;
	private String email;
	private String gender; 	
	
	@OneToMany(targetEntity =Course.class,cascade =CascadeType.ALL)
	@JoinColumn(name="id", referencedColumnName = "id")
	private List<Course> courses ;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String email, String gender, List<Course> courses) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.courses = courses;
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", gender=" + gender + ", courses="
				+ courses + "]";
	}

	
	

}
