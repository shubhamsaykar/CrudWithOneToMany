package com.StudentCourse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentCourse.entities.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

	


}
