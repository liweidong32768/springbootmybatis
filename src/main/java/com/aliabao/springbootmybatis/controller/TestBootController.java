package com.aliabao.springbootmybatis.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testboot")
public class TestBootController {

    @RequestMapping("/getUser")
    public String getUser(){

        return "abao";
    }
}
