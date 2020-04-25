package com.dbin.service;

import com.dbin.entity.Course;
import com.dbin.dao.CourseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author hi dbin
 * @Date 2020/4/25 19:13
 **/

@Service
public class CourseService {
    @Autowired
    private CourseDao courseDao;

    public void addCourse() {
        Course course=new Course();
        course.setName("ddd");


//        courseDao.insertCourse(course);
    }
}
