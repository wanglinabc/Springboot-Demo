package com.example.demo.Controller.Admin;

import com.example.demo.Entity.Admin;
import com.example.demo.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/admin/useradmin")
public class UserAdmin {

    @Autowired
    AdminService adminService;

    @PostMapping("/login")
    public Map login(String loginname, String loginpwd) {

        Map data = adminService.login( loginname, loginpwd );
        return data;

    }

    @PostMapping("/list")
    public String list() {
        return "list string";
    }

    @PostMapping("/register")
    public Map register(Admin admin) {
        Map data = adminService.register(admin);
        return data;
    }

}
