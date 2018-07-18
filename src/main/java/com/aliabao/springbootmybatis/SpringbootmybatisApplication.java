package com.aliabao.springbootmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.aliabao.springbootmybatis.dao")
public class SpringbootmybatisApplication{

    public static void main(String[] args) {
        SpringApplication.run(SpringbootmybatisApplication.class, args);
        System.out.println("程序运行成功！");
    }
}
