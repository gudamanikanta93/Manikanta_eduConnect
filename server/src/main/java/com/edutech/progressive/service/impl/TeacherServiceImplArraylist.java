package com.edutech.progressive.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.edutech.progressive.entity.Teacher;
import com.edutech.progressive.service.TeacherService;

public class TeacherServiceImplArraylist implements TeacherService {
    private static List<Teacher> teacherList= new ArrayList<>();

    @Override
    public List<Teacher> getAllTeachers() {
        // TODO Auto-generated method stub
        
        return teacherList;
    }

    @Override
    public Integer addTeacher(Teacher teacher) {
        // TODO Auto-generated method stub
        teacherList.add(teacher);
        return teacherList.size();
    }

    @Override
    public List<Teacher> getTeacherSortedByExperience() {
        // TODO Auto-generated method stub
       Collections.sort(teacherList);
       return teacherList;
    }
    public void emptyArrayList(){
        teacherList.clear();;
        
    }
    

}