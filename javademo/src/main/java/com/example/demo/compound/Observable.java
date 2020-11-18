package com.example.demo.compound;

import java.util.ArrayList;
import java.util.Iterator;

public class Observable  implements QuackObservable{
    ArrayList observers = new ArrayList();
    QuackObservable duck;
    public Observable (QuackObservable duck) {
        this.duck = duck;
    }
    @Override
    public void registerObserver(Observe observable) {
            observers.add(observable);
    }

    @Override
    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observe observer= (Observe) iterator.next();
            observer.update(duck);
        }
    }
}
