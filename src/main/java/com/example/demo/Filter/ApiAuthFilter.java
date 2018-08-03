package com.example.demo.Filter;

import com.example.demo.Util.AuthToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebFilter(filterName = "apiAuthFilter", urlPatterns = "/api/*")
public class ApiAuthFilter implements Filter {

    @Autowired
    private AuthToken authToken;

    //不需要登录就可以访问的路径(比如:注册登录等)
    String[] noFilterUrls = new String[]{/*"/api/user/login", "/api/user/register"*/};

    private Logger logger = LoggerFactory.getLogger( this.getClass() );

    @Override
    public void init( FilterConfig filterConfig ) throws ServletException {
        logger.info( "TestFilter init" );
    }

    @Override
    public void doFilter( ServletRequest request, ServletResponse response, FilterChain chain )
            throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        String currentUrl = httpServletRequest.getServletPath();

        System.out.println( currentUrl );

        boolean needFilter = isNeedFilter( currentUrl );
        //判断是否需要登录过滤
        if (!needFilter) {
            chain.doFilter( request, response );
        } else {
            Map<String, String[]> extraParams = new HashMap<String, String[]>( request.getParameterMap() );
            //extraParams.putAll( userInfo );
            RequestParameterWrapper requestParameterWrapper = new RequestParameterWrapper( httpServletRequest, extraParams );
            chain.doFilter( requestParameterWrapper, response );
        }

    }


    @Override
    public void destroy() {
        logger.info( "TestFilter destroy" );
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
