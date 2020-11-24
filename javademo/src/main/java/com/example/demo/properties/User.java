package com.example.demo.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Component:定义为容器组件
 * @PropertySource:加载指定配置文件
 * @ConfigurationProperties：加载配置文件中user对应的内容与User对象进行绑定
 */
@Component
@PropertySource("classpath:application.yml")
@ConfigurationProperties(prefix = "user")
public class User {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
