package com.example.demo.dymicproxy;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class PersonTest {
    Map<String, PersonBean> dataMap = new HashMap<>();
    public PersonTest() {
        initData();
    }

    private  void initData() {
        PersonBean shj = new PersonBeanImpl();
        shj.setName("shj");
        shj.setGender("m");
        shj.setInterests("play Game");
        shj.setHotOrNotRating(1);
        dataMap.put("shj", shj);
        shj = new PersonBeanImpl();
        shj.setName("wmk");
        shj.setGender("m");
        shj.setInterests("Study");
        shj.setHotOrNotRating(5);
        dataMap.put("wmk", shj);
        shj = new PersonBeanImpl();
        shj.setName("sjr");
        shj.setGender("w");
        shj.setInterests("Study & work");
        shj.setHotOrNotRating(100);
        dataMap.put("sjr", shj);
        this.setDataMap(dataMap);
    }

    public static void main(String[] args) {
        PersonTest personTest = new PersonTest();
        PersonBean shj = personTest.getDataMap().get("shj");
        PersonBean ownProxy = getOwnProxy(shj);
        ownProxy.setInterests("happy");
        try {
            ownProxy.setHotOrNotRating(10);
        } catch (Exception e) {
            System.out.println("不允许使用own proxy 修改rate ");
        }

        PersonBean otherProxy = getOtherProxy(personTest.getDataMap().get("wmk"));
        try {
            otherProxy.setInterests("study");
        } catch (Throwable e) {
            System.out.println("不允许使用other proxy 修改属性");
        }
        otherProxy.setHotOrNotRating(50);
    }


    public Map<String, PersonBean> getDataMap() {
        return dataMap;
    }

    public void setDataMap(Map<String, PersonBean> dataMap) {
        this.dataMap = dataMap;
    }

    // 返回操作自己的代理
    private static PersonBean getOwnProxy(PersonBean personBean) {
        System.out.println(personBean);
        return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                new OwnInvocationHandler(personBean));
    }

    // 返回操作其他人的代理
    private static PersonBean getOtherProxy(PersonBean personBean) {
        return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                new OthersInvocationHandler(personBean));
    }

}
