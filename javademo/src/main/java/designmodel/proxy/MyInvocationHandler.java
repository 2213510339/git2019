package designmodel.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler  implements InvocationHandler {
    private Object targrt = null;
    public MyInvocationHandler(Object object) {
        this.targrt = object;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.targrt, args);
    }
}
