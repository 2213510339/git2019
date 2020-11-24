package designmodel.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class SubjectDynamicProxy extends DynamicProxy{
    public static <T> T newProxyInstance(Subject subject) {
        ClassLoader classLoader = subject.getClass().getClassLoader();
        Class<?> [] interfaces = subject.getClass().getInterfaces();
        InvocationHandler invocationHandler = new MyInvocationHandler(subject);
        return (T) Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
    }
}
