package com.example.demo.Interceptor;

import com.example.demo.Service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Component
public class ApiAuthenticationHandlerInterceptor implements HandlerInterceptor {
    @Autowired
    private IUserService IUserService;
    //不需要登录就可以访问的路径(比如:注册登录等)
    String[] noFilterUrls = new String[]{"/api/user/login", "/api/user/register"};

    //在Controller执行之前调用，如果返回false，controller不执行
    @Override
    public boolean preHandle( HttpServletRequest request, HttpServletResponse response, Object handler ) throws Exception {
        String currentUrl = request.getServletPath();

        boolean needFilter = isNeedFilter( currentUrl );
        if(!needFilter){
            return true;
        }

        System.out.println( "我这里是登录拦截器" );

        String authToken = request.getParameter( "token" );
        String userId = request.getParameter( "userid" );
        if (authToken == null || userId == null) {
            response.setContentType( "application/json; charset=utf-8" );
            response.setCharacterEncoding( "UTF-8" );
            response.getWriter().write( "{\"status\":\"0\",\"msg\":\"参数错误\"}" );
            return false;
        }
        if (authToken.equals( "" ) || userId.equals( "" )) {
            response.setContentType( "application/json; charset=utf-8" );
            response.setCharacterEncoding( "UTF-8" );
            response.getWriter().write( "{\"status\":\"0\",\"msg\":\"参数错误\"}" );
            return false;
        }

        Map userInfo = getUserInfo( authToken, userId );
        if (userInfo.isEmpty()) {
            response.setContentType( "application/json; charset=utf-8" );
            response.setCharacterEncoding( "UTF-8" );
            response.getWriter().write( "{\"status\":\"0\",\"msg\":\"请先登录\"}" );
            return false;
        }
        System.out.println( "22222222222222222222" );
        System.out.println( userInfo );
        request.setAttribute( "userInfo", userInfo );

        /*
        String authToken = request.getParameter( "token" );
        String userId = request.getParameter( "userid" );
        if (authToken == null || userId == null) {
            throw new AuthException( "参数错误" );
        }
        if (authToken.equals( "" ) || userId.equals( "" )) {
            throw new AuthException( "参数错误" );
        }
        */
        return true;
    }

    //controller执行之后，且页面渲染之前调用
    @Override
    public void postHandle( HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView ) throws Exception {
        System.out.println( "控制器1执行完了，我执行了" );
    }

    //页面渲染之后调用，一般用于资源清理操作
    @Override
    public void afterCompletion( HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex ) throws Exception {
        System.out.println( "页面渲染1完了，我执行了" );
    }

    private Map getUserInfo( String authToken, String userId ) {
        return IUserService.hasLogin( userId, authToken );
    }

    public boolean isNeedFilter( String url ) {
        for (String includeUrl : noFilterUrls) {
            if (includeUrl.equals( url )) {
                return false;
            }
        }
        return true;
    }

}
