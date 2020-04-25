package com.dbin.entity;

import com.dbin.common.AppJpaIdEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@ToString
@Table(name="teacher")
public class Teacher extends AppJpaIdEntity {

//    private int teacherId;
    private String teacherName;
    private String teacherJobTitle;

}
