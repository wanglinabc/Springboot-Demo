package com.example.demo.Controller.api;

import com.example.demo.Dao.RedisDao;
import com.example.demo.Service.ParseJsonDataToMap;
import com.example.demo.Service.UserService;
import com.example.demo.Util.AuthToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/user")
public class user {
    @Autowired
    private RedisDao redisDao;
    @Autowired
    private UserService userService;
    @Autowired
    private AuthToken authToken;

    @RequestMapping("/set")
    public String set( String key, String value ) {
        redisDao.set( key, value );
        return "success";
    }

    @RequestMapping("/get")
    public Object get( String key ) {
        return redisDao.get( key );
    }

    @RequestMapping("/setHash")
    public Object setHash( String str ) {
        Object info = redisDao.hGetall( str );

        Map<String, String> map = ParseJsonDataToMap.parseOrgJsonToMap( info + "" );
        String daisy = map.get( "Daisy" );
        /*if(info != null){
            String value1 = info.get
        }*/
        return info instanceof Object;

        /*
        Map m1 = new HashMap();
        m1.put("Zara", "8");
        m1.put("Mahnaz", "31");
        m1.put("Ayan", "12");
        m1.put("Daisy", "14");
        redisDao.hmSet( "test1",m1);
        Object m2 = redisDao.hGetall( "test1" );
        return m2;
        */
    }

    @GetMapping("/login")
    public Map login( String username, String password ) {
        Map data = userService.login( username, password );
        return data;
    }

    @GetMapping("/register")
    public Map register( String username, String password ) {
        Map data = userService.register( username, password );
        return data;
    }
}
