package com.edutech.progressive.dao;

import java.util.ArrayList;
import java.util.List;

import com.edutech.progressive.entity.Course;

public class CourseDAOImpl implements CourseDAO{

    @Override
    public int addCourse(Course course) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'addCourse'");
        return -1;
    }

    @Override
    public Course getCourseById(int courseId) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getCourseById'");
        return null;
    }

    @Override
    public void updateCourse(Course course) {
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'updateCourse'");

    }

    @Override
    public void deleteCourse(int courseId) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'deleteCourse'");
    }

    @Override
    public List<Course> getAllCourses() {
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'getAllCourses'");
       return new ArrayList<>();
    }

}
