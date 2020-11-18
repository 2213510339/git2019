package com.example.demo.compound;

// 装饰者,计算叫了多少次
public class QuackCounter implements Quackable{
    Quackable duck;
    static int qucakCount;
    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }
    @Override
    public void quack() {
        duck.quack();
        qucakCount ++;
        notifyObservers();
    }
    public static int getQucakCount() {
        return qucakCount;
    }

    @Override
    public void registerObserver(Observe observe) {
    duck.registerObserver(observe);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();
    }
}
