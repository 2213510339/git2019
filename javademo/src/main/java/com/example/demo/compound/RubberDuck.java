package com.example.demo.compound;

public class RubberDuck implements Quackable{
    Observable observable;
    public RubberDuck() {
        observable = new Observable(this);
    }
    @Override
    public void quack() {
        System.out.println("RubberDuck qucak: squeak");
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
        return "RubberDuck";
    }
}
