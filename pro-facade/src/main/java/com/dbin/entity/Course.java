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
@Table(name="course")
public class Course extends AppJpaIdEntity {

    private String name;
    private Long teacherId;
    private int courseCredit;

}
