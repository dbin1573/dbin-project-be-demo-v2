package com.dbin.rest;

import com.dbin.entity.Student;
import com.dbin.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author hi dbin
 * @Date 2020/4/25 12:34
 **/

@RestController
public class frontUserController {
    @Autowired
    private CourseService courseService;
    @RequestMapping("/")
    public String test() {
        Student student = new Student();
        student.setName("binbin");
        courseService.addCourse();
        return "hi "+student.getName();
    }
}
