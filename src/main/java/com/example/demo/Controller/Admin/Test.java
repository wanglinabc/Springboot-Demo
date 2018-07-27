package com.example.demo.Controller.Admin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/test")
public class Test {

    @GetMapping("/index")
    public String test(){
        return "我是正常的";
    }


}
