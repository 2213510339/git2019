package com.example.demo.compound;

import java.util.ArrayList;
import java.util.Iterator;

// 组合模式, 管理一群鸭子
public class Flock  implements Quackable{
    ArrayList quacks = new ArrayList();
    public void add(Quackable quackable) {
        quacks.add(quackable);
    }
    @Override
    public void quack() {
        Iterator iterator = quacks.iterator();
        while(iterator.hasNext()) {
                Quackable quackable = (Quackable) iterator.next();
                quackable.quack();
        }
    }

    @Override
    public void registerObserver(Observe observe) {
        Iterator iterator = quacks.iterator();
        while(iterator.hasNext()) {
            Quackable duck = (Quackable) iterator.next();
            duck.registerObserver(observe);
        }
    }

    @Override
    public void notifyObservers() {
    }
}
