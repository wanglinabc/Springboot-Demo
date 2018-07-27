package com.example.demo.Interceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * 拦截器的配置
 */
@Configuration
public class WebAppConfigurer extends WebMvcConfigurationSupport {
    //由于在拦截器中注解无效，需要提前注入bean
    @Bean
    public AdminAuthenticationHandlerInterceptor getMyHandlerInterceptor(){
        return new AdminAuthenticationHandlerInterceptor();
    }

    @Bean
    public AdminAuthorizationHandlerInterceptor getAuthorizationHandlerInterceptor(){
        return new AdminAuthorizationHandlerInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 多个拦截器组成一个拦截器链
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截
        registry.addInterceptor(getMyHandlerInterceptor()).addPathPatterns("/admin/**").excludePathPatterns("/admin/useradmin/login", "/admin/useradmin/register");
        registry.addInterceptor(getAuthorizationHandlerInterceptor()).addPathPatterns("/admin/**").excludePathPatterns("/admin/test/info");
        super.addInterceptors(registry);
    }

}
