package com.example.demo.designmodel.single;

import designmodel.single.Singleton;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SingletonTest {
    @Test
    public void testSingle(){

        for (int i = 0; i < 5 ; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Singleton.say();
                }
            }).start();
        }

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Singleton.getCount());

            }
        }).start();

    }
    @Test
    public void testExecutor() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future future = executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println(" test executor");
            }
        });
        executorService.shutdown();
        System.out.println(future.get());
    }
}
