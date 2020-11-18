package com.example.demo.compound;

// 适配器模式, 将鹅适配成鸭子
public class GooseAdapter implements Quackable{
    Goose goose;
    Observable observable;
    public GooseAdapter(Goose goose) {
        this.goose = goose;
        observable = new Observable(this);
    }
    @Override
    public void quack() {
        goose.honk();
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
}
