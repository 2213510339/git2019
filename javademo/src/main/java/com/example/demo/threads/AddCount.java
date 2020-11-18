package com.example.demo.threads;

import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicLong;

public class AddCount {
    private final AtomicLong count = new AtomicLong(0);
//    private long count = 0L;
    public  long getCount() {
        return count.get();
//        return count;
    }
    public void doService(String a) {
        count.incrementAndGet();
//        count ++;
        System.out.println(Thread.currentThread().getName() + ":" + a + ", count: " +getCount());
    }
}
