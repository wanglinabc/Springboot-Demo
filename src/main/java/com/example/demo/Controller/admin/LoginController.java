package com.example.demo.Controller.admin;

import com.example.demo.Service.IAdminService;
import com.example.demo.Util.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * admin后台登录控制器
 */
@RestController
@RequestMapping(value = "/admin/login")
@Api(description="管理员操作接口", tags="AdminApi")
public class LoginController
{
    @Autowired
    private IAdminService iadminService;

    @PostMapping(value = "/index")
    @ApiOperation(value="用户登录", notes="根据用户名密码登录")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username",value = "登录账户名",required = true, paramType = "form", dataType = "String"),
            @ApiImplicitParam(name = "password",value = "密码",required = true,paramType = "form",dataType = "string")
    })
    public ResponseResult login(String username,String password)
    {
        ResponseResult responseResult=iadminService.login(username,password);
       if(responseResult.isSuccess()){
           return responseResult;
       }
        return ResponseResult.createByErrorMessage("用户名或密码错误");
    }


    @PostMapping(value = "/register")
    @ApiOperation(value="用户注册", notes="注册后台")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username",value = "登录账户名",required = true, paramType = "form", dataType = "String"),
            @ApiImplicitParam(name = "loginname",value = "密码",required = true,paramType = "form",dataType = "string"),
            @ApiImplicitParam(name = "loginpwd",value = "密码",required = true,paramType = "form",dataType = "string"),
            @ApiImplicitParam(name = "userphone",value = "密码",required = true,paramType = "form",dataType = "string"),
            @ApiImplicitParam(name = "sex",value = "密码",required = true,paramType = "form",dataType = "string"),
            @ApiImplicitParam(name = "userremark",value = "密码",required = false,paramType = "form",dataType = "string")
    })
    public ResponseResult register(String username,String loginname,String loginpwd,String userphone,byte sex,String userremark)
    {
        ResponseResult responseResult=iadminService.register(username,loginname,loginpwd,userphone,sex,userremark);
        return  responseResult;
    }

}
