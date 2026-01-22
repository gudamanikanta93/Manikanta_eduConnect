package com.edutech.progressive.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edutech.progressive.entity.Course;
import com.edutech.progressive.entity.User;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer>{
    
}
