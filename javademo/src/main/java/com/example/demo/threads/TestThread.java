package com.example.demo.threads;

public class TestThread {
    public static void main(String[] args) {
        AddCount addCount = new AddCount();
        Thread Thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                addCount.doService("11");
            }
        }, "thread1");
        Thread Thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                addCount.doService("21");
                addCount.doService("22");
            }
        }, "Thread2");
        Thread Thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                addCount.doService("31");
                addCount.doService("32");
            }
        }, "Thread2");
        Thread2.start();
        Thread3.start();
        Thread1.start();

    }
}
