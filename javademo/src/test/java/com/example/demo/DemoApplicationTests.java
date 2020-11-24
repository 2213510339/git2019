package com.example.demo;

import com.example.demo.properties.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
    User user;
    @Test
    void contextLoads() {
        System.out.println(user);
    }

}
