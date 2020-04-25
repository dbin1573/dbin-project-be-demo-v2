package com.dbin.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestScore {

    private int studentId;
    private String studentName;
    private int courseId;
    private String courseName;
    private int courseScore;

}
