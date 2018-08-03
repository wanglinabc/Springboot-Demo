package com.example.demo.Service.Impl;

import com.example.demo.Dao.RedisDao;
import com.example.demo.Dao.UserMapper;
import com.example.demo.Entity.User;
import com.example.demo.Entity.UserExample;
import com.example.demo.Service.ParseJsonDataToMap;
import com.example.demo.Service.IUserService;
import com.example.demo.Util.AuthToken;
import com.example.demo.Util.MD5;
import com.example.demo.Util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service(value = "userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMappers;
    @Autowired
    private RedisDao redisDao;
    @Autowired
    private AuthToken authToken;

    public int addUser( User user ) {
        return userMappers.insertSelective( user );
    }

    /**
     * 判断是否登录
     *
     * @param userID
     * @param token
     * @return Map
     */
    public Map<String, String> hasLogin( String userID, String token ) {
        Map info = redisDao.hGetall( token );
        if (info == null) {
            return new HashMap<>();
        }
        if (info.get( "userid" ) == null || !info.get( "userid" ).equals( userID )) {
            return new HashMap<>();
        }

        return info;
    }

    /**
     * 用户登录
     *
     * @param phone
     * @param password
     * @return
     */
    public ResponseResult<Map> login( String phone, String password ) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andPhoneEqualTo( phone );
        password = MD5.getMD5( password );
        criteria.andPasswordEqualTo( password );
        List<?> list = userMappers.selectByExample( example );
        if (list.size() == 0) {
            return ResponseResult.createByErrorMessage( "用户名或密码错误" );
        }

        Map data = ParseJsonDataToMap.parseOrgJsonToMap( list.get( 0 ).toString() );
        String token = authToken.getToken();
        data.put( "token", token );
        redisDao.hmSet( token, data );
        return ResponseResult.createBySuccessMsgData( "登录成功",data );
    }

    /**
     * @param Phone
     * @param password
     * @return
     */
    public ResponseResult register( String Phone, String password ) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andPhoneEqualTo( Phone );
        User user = userMappers.selectOneByExample( example );
        Map result = new HashMap();
        if (user != null) {
            return ResponseResult.createByErrorMessage( "当前用户已存在" );
        }
        password = MD5.getMD5( password );
        User userObj = new User();
        userObj.setPhone( Phone );
        userObj.setPassword( password );
        userObj.setInvitecode( authToken.getToken() );
        if (userMappers.insertSelective( userObj ) == 1) {
            return ResponseResult.createBySuccessMessage( "注册成功" );
        } else {
            return ResponseResult.createByErrorMessage( "注册失败" );
        }
    }
}
