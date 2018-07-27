package com.example.demo.Service;

import com.example.demo.Dao.AdminMapper;
import com.example.demo.Entity.Admin;
import com.example.demo.Entity.AdminExample;
import com.example.demo.Util.CheckPassWord;
import com.example.demo.Util.JSONResult;
import com.example.demo.Util.JwtAuth;
import com.example.demo.Util.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service(value = "adminService")
public class AdminService {

    @Autowired
    AdminMapper adminMapper;

    @Autowired
    JwtAuth jwtAuth;

    /**
     * 用户登录
     *
     * @param loginname
     * @param loginpwd
     * @return
     */
    public Map login(String loginname , String loginpwd) {

        if  (loginname == null || loginname.length() <= 0) {
            return JSONResult.outPutJson(0, "请输入登陆名");
        }

        if (loginpwd == null || loginpwd.length() <= 0) {
            return JSONResult.outPutJson(0, "请输入密码");
        }

        AdminExample example = new AdminExample();
        AdminExample.Criteria criteria = example.createCriteria();
        criteria.andLoginnameEqualTo( loginname );
        loginpwd = MD5.getMD5( loginpwd );
        criteria.andLoginpwdEqualTo( loginpwd );
        List<?> list = adminMapper.selectByExample( example );

        if (list.size() == 0) {
            return JSONResult.outPutJson(0, "用户名或密码错误");
        }

        Map data = ParseJsonDataToMap.parseOrgJsonToMap( list.get( 0 ).toString() );

        String token = jwtAuth.createJWT(String.valueOf(data.get("adminid")));

        Map admin = new HashMap();
        admin.put( "token", token );
        JSONResult.setResult(admin);
        return JSONResult.outPutJson(1, "登录成功");
    }

    public Map register(Admin user) {

        if (user.getLoginname() == null ||  user.getLoginname().length() <= 0 ) {
            return JSONResult.outPutJson(0, "用户名不能为空");
        }

        if (user.getLoginpwd() == null || user.getLoginpwd().length() <= 0) {
            return JSONResult.outPutJson(0, "密码不能为空");
        }

        if (!CheckPassWord.checkPassWordMethod(user.getLoginpwd())) {
            return JSONResult.outPutJson(0, "密码必须大于8位,并且包含字母数字");
        }

        return JSONResult.outPutJson(1, "注册成功");
    }
}
