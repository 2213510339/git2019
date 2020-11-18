package com.example.demo.dymicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// 对其他人的操作
public class OthersInvocationHandler implements InvocationHandler {
    PersonBean personBean;
    public OthersInvocationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Exception  {
        System.out.println(method.getName());
        try {
            if(method.getName().startsWith("get")) {
                return method.invoke(personBean, args);
            } else if(method.getName().equals("setHotOrNotRating")) {
                return method.invoke(personBean, args);
            } else if(method.getName().startsWith("set")) {
                throw new IllegalAccessException();
            }
            else if (method.getName().equals("toString")) {
                return method.invoke(personBean, args);
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
