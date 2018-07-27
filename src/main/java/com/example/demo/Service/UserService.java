package com.example.demo.Service;

import com.example.demo.Dao.RedisDao;
import com.example.demo.Dao.UserMapper;
import com.example.demo.Entity.User;
import com.example.demo.Entity.UserExample;
import com.example.demo.Util.AuthToken;
import com.example.demo.Util.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service(value = "userService")
public class UserService {

    @Autowired
    private UserMapper userMappers;
    @Autowired
    private RedisDao redisDao;
    @Autowired
    private AuthToken authToken;

    public int addUser( User user ) {
        return 1;//userMappers.insertSelective(user);
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
            return new HashMap<>( );
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
    public Map login( String phone, String password ) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andPhoneEqualTo( phone );
        password = MD5.getMD5( password );
        criteria.andPasswordEqualTo( password );
        List<?> list = userMappers.selectByExample( example );
        Map result = new HashMap();
        if (list.size() == 0) {
            result.put( "result", 0 );
            result.put( "msg", "用户名或密码错误" );
            return result;
        }
        Map data = ParseJsonDataToMap.parseOrgJsonToMap( list.get( 0 ).toString() );
        String token = authToken.getToken();
        data.put( "token", token );
        redisDao.hmSet( token, data );
        result.put( "result", 1 );
        result.put( "msg", "登录成功" );
        result.put( "data", data );
        return result;
    }

    /**
     * @param Phone
     * @param password
     * @return
     */
    public Map register( String Phone, String password ) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andPhoneEqualTo( Phone );
        User user = userMappers.selectOneByExample( example );
        Map result = new HashMap();
        if (user != null) {
            result.put( "result", 0 );
            result.put( "msg", "当前用户已存在" );
            return result;
        }
        password = MD5.getMD5( password );
        User userObj = new User();
        userObj.setPhone( Phone );
        userObj.setPassword( password );
        userObj.setInvitecode( authToken.getToken() );
        if (userMappers.insertSelective( userObj ) == 1) {
            result.put( "result", 1 );
            result.put( "message", "注册成功" );
        } else {
            result.put( "result", 0 );
            result.put( "message", "注册失败" );
        }
        return result;
    }
}
