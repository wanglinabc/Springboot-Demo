package com.example.demo.Controller;


import com.example.demo.Config.getApplicationConfig;
import com.example.demo.Entity.User;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@RestController
@RequestMapping("/hello")
public class Helloworld
{
   @Autowired
    private getApplicationConfig config;
   @Autowired
    private UserService UserService;

    @GetMapping("/world")
    public String sayhello()
    {
        return "Hello world"+config.getPageSize();
    }

   /* @GetMapping("/add1")
    public int addUser1(byte age,byte sex,String name)
    {
        Date date = new Date();
        long createtime=date.getTime()/1000;
        User user=new User();
        user.setAge(age);
        user.setSex(sex);
        user.setUserName(name);
        user.setCreateTime(createtime);
        return  UserService.addUser(user);
    }*/
    @GetMapping("/add2")
    public String addUser2(HttpServletRequest request)
    {

        String age=request.getParameter("age");
        String name=request.getParameter("name");
        String sex=request.getParameter("sex");
        return "我叫"+name+",我是男生，今年"+age+"岁了";
    }
}
