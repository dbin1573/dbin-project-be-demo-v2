package com.dbin.common;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Author hi dbin
 * @Date 2020/4/25 16:18
 **/

@MappedSuperclass
@Access(AccessType.FIELD)
@Data
public class AppJpaIdEntity implements Serializable {

    private static final long serialVersionUID = 1L ;

    @Id
//    @GeneratedValue(generator = "generatedkey")
//    @GenericGenerator(name = "generatedkey", strategy = "com.fosung.framework.common.support.dao.entity.id.AppJpaEntityLongIDGenerator")
    @GeneratedValue( strategy = GenerationType.AUTO)
    @Column
    protected Long id ;

}
