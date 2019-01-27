package com.peng.xunwu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @program: xunwu
 * @description: Thmeleaf测试控制器
 * @author: peng
 * @create: 2019-01-26 18:12
 **/

@Controller
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping(value = "/error",method = RequestMethod.GET)
    public String error(){
        System.out.println("405");

        return "404";
    }




}
