package com.example.demo.compound;

public class RedHeadDuck implements Quackable{
    Observable observable;
    public RedHeadDuck(){
        observable = new Observable(this);
    }
    @Override
    public void quack() {
        System.out.println("RedHeadDuck qucack: guagua");
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
        return "RedHeadDuck";
    }
}
