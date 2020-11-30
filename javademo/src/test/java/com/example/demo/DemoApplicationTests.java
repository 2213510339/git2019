package com.example.demo;

import com.example.demo.entity.User;
import com.example.demo.entity.mapper.UserMapper;
import configure.*;
import com.example.demo.properties.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

// TDD 三定律

/**
 * 1 在编写不能通过的单元测试前,不可编写生产代码
 * 2 只可编写刚好无法通过的单元测试,不能编译也算不通过
 * 3 只可编写刚好足以通过当前失败测试的生产代码
 */
// 测试可以拆分为三个环节: 构造测试数据, 操作测试数据, 检验操作是否达到期望结果

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void  testMybatis() {
        User user = userMapper.findUserByNameAndPass("1", "1");
        for (int i = 60; i < 150; i++) {
            user.setLoginName("shj" + i);
            user.setLoginPass("shj" + i);
            user.setName("name" + i);
            user.setStatus(i % 4);
            userMapper.insert(user);
        }
        System.out.println(user);
    }
//    @Autowired
//    User user;

    @Autowired
    Drivers drivers;

    @Autowired
    Cars cars;

//    @Test
//    void contextLoads() {
//        System.out.println(user);
//    }
    @Test
    void getUserInfo(){
        System.out.println(drivers.getCars() == cars);
    }

}
