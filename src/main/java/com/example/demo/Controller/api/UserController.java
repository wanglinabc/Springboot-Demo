package com.example.demo.Controller.api;

import com.example.demo.Dao.RedisDao;
import com.example.demo.Service.IUserService;
import com.example.demo.Service.ParseJsonDataToMap;
import com.example.demo.Util.AuthToken;
import com.example.demo.Util.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@ApiIgnore
@Api(description ="用户操作", tags="UserApi")
@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private RedisDao redisDao;
    @Autowired
    private IUserService IUserService;
    @Autowired
    private AuthToken authToken;
    @Autowired
    private HttpServletRequest request;
    @ApiIgnore
    @RequestMapping("/set")
    public String set( String key, String value ) {
        redisDao.set( key, value );
        return "success";
    }
    @ApiIgnore
    @RequestMapping("/get")
    public Object get( String key ) {
        //获取用户信息
        /*ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        Object userInfo = requestAttributes.getAttribute( "userInfo",RequestAttributes.SCOPE_REQUEST );
        return userInfo;*/
        return redisDao.get( key );
    }
    @ApiIgnore
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
    @ApiOperation(value="登录", notes="根据用户名密码登录")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username",value = "用户名", dataType = "String",required = true, paramType = "用户名"),
            @ApiImplicitParam(dataType = "string",name = "password",value = "密码",required = true,paramType = "path")
    })
    public ResponseResult login(@RequestParam(value="username" ,required =true )  String username, String password ) {
        ResponseResult data = IUserService.login( username, password );
        return data;
    }

    @GetMapping("/register")
    public ResponseResult register( String username, String password ) {
        ResponseResult data = IUserService.register( username, password );
        return data;
    }
}
