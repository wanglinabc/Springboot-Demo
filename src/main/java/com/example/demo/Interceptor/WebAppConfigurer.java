package com.example.demo.Interceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * 拦截器的配置
 */
@Configuration
public class WebAppConfigurer extends WebMvcConfigurationSupport {

    //admin拦截器排除的url
    private String[] adminExcept={"/admin/login/index","/admin/login/register","/swagger-resources/**", "/webjars/**", "/v2/**", "/swagger-ui.html/**"};

    //api拦截器排除的url
    private String[] apiExcept={"/swagger-resources/**", "/webjars/**", "/v2/**", "/swagger-ui.html/**"};

    //由于在拦截器中注解无效，需要提前注入bean
    @Bean
    public AdminAuthenticationHandlerInterceptor getMyHandlerInterceptor(){
        return new AdminAuthenticationHandlerInterceptor();
    }

    @Bean
    public AdminAuthorizationHandlerInterceptor getAuthorizationHandlerInterceptor(){
        return new AdminAuthorizationHandlerInterceptor();
    }

    @Bean
    public ApiAuthenticationHandlerInterceptor getApiAuthorizationHandlerInterceptor(){
        return new ApiAuthenticationHandlerInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getMyHandlerInterceptor()).addPathPatterns("/admin/**").excludePathPatterns(adminExcept);
        registry.addInterceptor(getAuthorizationHandlerInterceptor()).addPathPatterns("/admin/**").excludePathPatterns(adminExcept);
        //api的拦截器
        registry.addInterceptor(getApiAuthorizationHandlerInterceptor()).addPathPatterns("/api/**").excludePathPatterns(apiExcept);
        super.addInterceptors(registry);
    }



}
