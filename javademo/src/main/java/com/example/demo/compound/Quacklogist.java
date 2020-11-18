package com.example.demo.compound;

public class Quacklogist implements Observe {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quacklogist: " + duck + "just qucaked");
    }
}
