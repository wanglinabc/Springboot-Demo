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
        // 多个拦截器组成一个拦截器链
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截

        //admin的拦截器
//        registry.addInterceptor(getMyHandlerInterceptor())
//                .addPathPatterns("/**")
//                .excludePathPatterns(adminExcept)
//                .excludePathPatterns(apiExcept)
//                .excludePathPatterns("/swagger-resources/**", "/webjars/**", "/v2/**", "/swagger-ui.html/**");
        registry.addInterceptor(getMyHandlerInterceptor()).addPathPatterns("/admin/**").excludePathPatterns(adminExcept);
        registry.addInterceptor(getAuthorizationHandlerInterceptor()).addPathPatterns("/admin/**").excludePathPatterns(adminExcept);

        //api的拦截器
        registry.addInterceptor(getApiAuthorizationHandlerInterceptor()).addPathPatterns("/api/**").excludePathPatterns(apiExcept);
        super.addInterceptors(registry);
    }

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

}
