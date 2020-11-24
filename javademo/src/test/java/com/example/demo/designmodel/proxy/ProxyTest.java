package com.example.demo.designmodel.proxy;

import designmodel.proxy.*;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationHandler;

public class ProxyTest {

    @Test
    public void testSubject() {
        Subject subject = new RealSubject();
        InvocationHandler invocationHandler = new MyInvocationHandler(subject);
        /**
         * 查找Subject类所有的接口,然后实现接口的方法(空实现),
         * 交给 new MyInvocationHandler(subject); 这个对象管理
         */
        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(),
                subject.getClass().getInterfaces(), invocationHandler);
        proxy.doSomething();

    }
    @Test
    public void testSubjectDynamicProxy() {
        Subject subject = new RealSubject();
        Subject proxy = SubjectDynamicProxy.newProxyInstance(subject);
        proxy.doSomething();
    }
}
