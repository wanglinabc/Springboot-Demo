package com.example.demo.Service.Impl;

import com.example.demo.Dao.AdminMapper;
import com.example.demo.Entity.Admin;
import com.example.demo.Service.IAdminService;
import com.example.demo.Util.JwtAuth;
import com.example.demo.Util.MD5;
import com.example.demo.Util.RandStr;
import com.example.demo.Util.ResponseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service(value = "iadminService")
@Slf4j
public class AdminServiceImpl implements IAdminService {

    @Autowired
    private AdminMapper adminMapper;

    /**
     * admin 用户登录接口
     *
     * @param login_name
     * @param login_pwd
     * @return ResponseResult
     */
    @Override
    public ResponseResult<Map> login(String login_name, String login_pwd) {
        if ("".equals(login_name) || "".equals(login_pwd)) {
            return ResponseResult.createByErrorMessage("用户名或密码不得为空");
        }
        Admin admin = adminMapper.selectByLoginName(login_name);
        if (admin == null) {
            return ResponseResult.createByErrorMessage("用户名不存在");
        }
        String realpwd = MD5.getMD5(admin.getSecret()+login_pwd);
        if(!realpwd.equals(admin.getLoginPwd())){
            return ResponseResult.createByErrorMessage("密码错误");
        }
        //生成一个登录token
        String JwtToken= JwtAuth.createJWT(admin.getAdminId());

        Map<String,Object> result=new HashMap<String, Object>();
        result.put("token",JwtToken);
        return ResponseResult.createBySuccessMsgData("登录成功",result);
    }

    /**
     * 添加管理员
     *
     * @param username   用户名
     * @param loginname  登录账户
     * @param loginpwd   登录密码
     * @param userphone  手机号
     * @param sex        性别1为男2为女
     * @param userremark 用户备注
     * @return ResponseResult
     */
    @Override
    public ResponseResult register(String username, String loginname, String loginpwd, String userphone, byte sex, String userremark) {
         byte isSuper=0;
         byte status=1;
        Admin admin=new Admin();
        admin.setUserName(username);
        admin.setLoginName(loginname);
        admin.setSecret(RandStr.getRandStr(6));
        admin.setLoginPwd(MD5.getMD5(admin.getSecret()+loginpwd));
        admin.setUserPhone(userphone);
        admin.setCreateTime(System.currentTimeMillis()/1000);
        admin.setSex(sex);
        admin.setStatus(status);
        admin.setIsSuper(isSuper);
        admin.setUserRemark(userremark);
        admin.setUpdateTime(System.currentTimeMillis()/1000);
        int result =adminMapper.insert(admin);
        if(result>0){
            return  ResponseResult.createBySuccessMessage("添加成功！");
        }
        return  ResponseResult.createByErrorMessage("添加失败！");

    }


}
