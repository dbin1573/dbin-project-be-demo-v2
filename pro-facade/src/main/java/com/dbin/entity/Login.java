package com.dbin.entity;

import com.dbin.common.AppJpaIdEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name="administer")
public class Login extends AppJpaIdEntity {

    private String username;
    private String password;
}
