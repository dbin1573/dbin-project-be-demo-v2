package com.dbin.rest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@EntityScan(basePackages = "com.dbin.entity")
@MapperScan(basePackages = "com.dbin.dao")
@SpringBootApplication
public class ProRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProRestApplication.class, args);
    }

}
