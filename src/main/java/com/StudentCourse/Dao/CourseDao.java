package com.StudentCourse.Dao;

import com.StudentCourse.entities.Student;

public class CourseDao {

	private Student student;

	
	public CourseDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CourseDao(Student student) {
		super();
		this.student = student;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "CourseDao [student=" + student + "]";
	}

	
	
	
}
