package com.edutech.progressive.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.edutech.progressive.dao.StudentDAO;
import com.edutech.progressive.entity.Student;
import com.edutech.progressive.service.StudentService;

public class StudentServiceImplJdbc implements StudentService {
    private StudentDAO studentDAO;


    @Override
    public List<Student> getAllStudents() {
        // TODO Auto-generated method stub
        return new ArrayList<>();
    }

    @Override
    public Integer addStudent(Student student) {
        // TODO Auto-generated method stub
       return -1;
    }

    @Override
    public List<Student> getAllStudentSortedByName() {
        // TODO Auto-generated method stub
        return new ArrayList<>();
    }
    public void updateStudent(Student student){
 
    }
 
    public void deleteStudent(int studentId){
 
    }
 
    public Student getStudentById(int studentId){
        return null;
    }

}