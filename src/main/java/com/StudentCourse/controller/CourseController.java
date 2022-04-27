package com.StudentCourse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.StudentCourse.Dao.CourseDao;
import com.StudentCourse.entities.Course;
import com.StudentCourse.entities.Student;
import com.StudentCourse.repository.CourseRepository;
import com.StudentCourse.repository.StudentRepository;

@RestController
public class CourseController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private CourseRepository courseRepository;
	
	//its working API sending the student info as well as course name
	@PostMapping("/addStudents")
	public Student postStudent(@RequestBody CourseDao course) {
		return studentRepository.save(course.getStudent());
	}
	
	//its working API fetching all students and associated courses
	@GetMapping("/findAllStudents")
	public List<Student> findStudents(){
		return studentRepository.findAll();
	}
	
	
	// working API deleting course id from course table
	@DeleteMapping("/deleteCourseById/{id}")
	public  void deleteCourse(@PathVariable Integer id){
		courseRepository.deleteById(id);
	}
	
	
//	@DeleteMapping("/deletestudentById/{id}"
//			+ "")
//	public void deleteStudentById(@PathVariable Integer id)
//	{
//		courseRepository.deleteById(id);
//	}
	
	

	

}
