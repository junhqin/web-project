package com.itheima.controller;

import com.itheima.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

//
@RestController
public class HelloController {

    //基本方式
//    @RequestMapping("/simpleParam")
//    public String simpleParam(HttpServletRequest req){
//        String name = req.getParameter("name");
//        String ageStr = req.getParameter("age");
//
//        return ageStr+' '+name;
//    }Web-Springboot
//No Environment
//POST
//http://localhost:8080/simpleParam
//Query Params
//200OK
//83 ms
//168 B
//1
//42Tom
//Online
//SAVE REQUEST


    //基于SpringBoot方式
    @RequestMapping("/simpleParam")
    public String simpleParam(@RequestParam(name="strname")String username, Integer age){

        System.out.println(username+':'+age);
        return age+' '+ username;
    }

    //实体参数
    @RequestMapping("/simplePojo")
    public String simplePojo(User user){
        System.out.println(user);
        return user.toString();
    }
}
