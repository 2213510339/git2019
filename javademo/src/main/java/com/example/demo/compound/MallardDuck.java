package com.example.demo.compound;

public class MallardDuck implements Quackable{
    Observable observable;
    public MallardDuck(){
        observable = new Observable(this);
    }
    @Override
    public void quack() {
        System.out.println("MallardDuck qucak: guagua");
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
        return "MallardDuck";
    }
}
