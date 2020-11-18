package com.example.demo.compound;


// 观察者, 监视个别行为
public interface QuackObservable {
    void registerObserver(Observe observe);
    void notifyObservers();
    String toString();
}
