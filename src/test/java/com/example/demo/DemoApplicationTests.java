package com.example.demo;

import com.example.demo.Entity.Admin;
import com.example.demo.Service.IAdminService;
import com.example.demo.Util.ResponseResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private IAdminService iAdminService;
    @Test
    public void contextLoads() {
        ResponseResult ResponseResult=iAdminService.login("wanglin","123456");
       System.out.println(ResponseResult.getData().toString());
    }

}
