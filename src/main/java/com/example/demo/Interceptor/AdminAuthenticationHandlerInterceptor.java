package com.example.demo.Interceptor;

import com.example.demo.Exception.AdminException;
import com.example.demo.Util.JwtAuth;
import io.jsonwebtoken.Claims;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class AdminAuthenticationHandlerInterceptor implements HandlerInterceptor {

    //在Controller执行之前调用，如果返回false，controller不执行
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        System.out.println("我这里是登录拦截器");

        String auth = request.getHeader("Authorization");
        if (auth == null || auth.length() < 7) {
            throw new AdminException(401, "缺少认证信息");
        }

        //判断是否有auth验证信息
        String HeadStr = auth.substring(0, 6).toLowerCase();

        if (HeadStr.compareTo("bearer") != 0) {
            throw new AdminException(400, "bearer 验证错误");
        }

        //解析token
        auth = auth.substring(7, auth.length());
        Claims claims = JwtAuth.parseJWT(auth);

        if (claims == null) {
            throw new AdminException(400, "大胆小贼，你token有问题");
        }

        //判断是否过期
        if (System.currentTimeMillis() > (Long) claims.get("outtime")) {
            throw new AdminException(410, "登陆超时，请从新登陆");
        }

        request.setAttribute("userid", claims.get("userid"));

        return true;
    }

    //controller执行之后，且页面渲染之前调用
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("控制器1执行完了，我执行了");
    }

    //页面渲染之后调用，一般用于资源清理操作
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("页面渲染1完了，我执行了");
    }
}
