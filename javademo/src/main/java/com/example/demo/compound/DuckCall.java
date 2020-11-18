package com.example.demo.compound;

public class DuckCall implements Quackable{
    Observable observable;
    public  DuckCall(){
        observable = new Observable(this);
    }
    @Override
    public void quack() {
        System.out.println("DuckCall quack: Kwak");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observe observe) {
        observable.registerObserver(observe);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String toString() {
        return "DuckCall";
    }
}
