package com.StudentCourse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentCourse.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

	void deleteByCid(Integer id);

}
