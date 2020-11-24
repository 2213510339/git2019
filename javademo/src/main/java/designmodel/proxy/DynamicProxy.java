package designmodel.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxy<T> {
    public static <T> T newProxyInstance(ClassLoader classLoader, Class<?> [] interfaces, InvocationHandler handler) {
        if (true) {
            new BeforeAdvice().execute();
        }
        return (T) Proxy.newProxyInstance(classLoader, interfaces, handler);
    }
}
