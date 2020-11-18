package com.example.demo.compound;
// 工厂模式,生产各种鸭子
public abstract class AbstrcDuckFactory {
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedHeadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();
}
