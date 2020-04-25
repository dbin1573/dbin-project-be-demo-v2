package com.dbin.entity;

import com.dbin.common.AppJpaIdEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@ToString
@Table(name="student")
public class Student extends AppJpaIdEntity {

    @Column
    private String name;
    /**
     * 性别
     */
    @Column
    private String gender;
    @Column
    private String classId;
    /**
     * 主修
     */
    @Column
    private String major;
    /**
     * 学院系别
     */
    @Column
    private String department;

    @Column
    private String rewOrPun;

}
