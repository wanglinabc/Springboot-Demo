package com.example.demo.Config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 获取全局通用配置文件
 */

@Component
@ConfigurationProperties(prefix = "com")
public class getApplicationConfig {

    private int pageSize;

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
