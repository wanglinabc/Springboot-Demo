package com.example.demo.Service;


import com.example.demo.Util.ResponseResult;

public interface IAdminService {

    /**
     *  admin 用户登录接口
     *
     * @param login_name
     * @param login_pwd
     * @return ResponseResult
     */
    ResponseResult login(String login_name,String login_pwd);

    /**
     * 添加管理员
     * @param username 用户名
     * @param loginname 登录账户
     * @param loginpwd  登录密码
     * @param userphone 手机号
     * @param sex 性别1为男2为女
     * @param userremark 用户备注
     * @return ResponseResult
     */
    ResponseResult register(String username,String loginname,String loginpwd,String userphone,byte sex,String userremark);
}
