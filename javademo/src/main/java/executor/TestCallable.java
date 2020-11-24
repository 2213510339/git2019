package executor;

import java.util.concurrent.Callable;

public class TestCallable implements Callable<String> {
    private int id;
    public TestCallable(int id) {
        this.id = id;
    }
    @Override
    public String call() throws Exception {
        System.out.println("testCall 的call() 被自动调用: ->" + Thread.currentThread().getName());
        return  "call 方法返回结果:  " + id + "  " +  Thread.currentThread().getName();
    }
}
