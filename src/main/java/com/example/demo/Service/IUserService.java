package com.example.demo.Service;

import com.example.demo.Dao.RedisDao;
import com.example.demo.Dao.UserMapper;
import com.example.demo.Entity.User;
import com.example.demo.Entity.UserExample;
import com.example.demo.Util.AuthToken;
import com.example.demo.Util.MD5;
import com.example.demo.Util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service(value = "userService")
public interface IUserService {

    /**
     * 添加用户
     * @param user
     * @return
     */
    public int addUser( User user );

    /**
     * 判断是否登录
     *
     * @param userID
     * @param token
     * @return Map
     */
    public Map<String, String> hasLogin( String userID, String token );

    /**
     * 用户登录
     *
     * @param phone
     * @param password
     * @return
     */
    public ResponseResult login( String phone, String password );

    /**
     * @param Phone
     * @param password
     * @return
     */
    public ResponseResult register( String Phone, String password );
}
