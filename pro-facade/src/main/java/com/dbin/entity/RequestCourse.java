package com.dbin.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestCourse {

    private int teacherId;
    private String teacherName;
    private int courseId;
    private String courseName;
    private int courseCredit;

}
