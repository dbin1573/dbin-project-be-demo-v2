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
@Table(name="score")
public class Score extends AppJpaIdEntity {

    private Long studentId;
    private Long courseId;
    private int stuCouScore;

}
