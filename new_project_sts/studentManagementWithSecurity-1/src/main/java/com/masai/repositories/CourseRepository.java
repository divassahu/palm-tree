package com.masai.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.models.Course;


@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{

}
