package com.example.demo.state;

public class SoldOutState implements State{

    transient MachinePuls machine;
    public SoldOutState(MachinePuls machine) {
        this.machine = machine;
    }
    @Override
    public void insertCoin() {
        System.out.println("糖果售罄了");
    }

    @Override
    public void refuseCoin() {
        System.out.println("糖果售罄了");
    }

    @Override
    public void pushCrank() {
        System.out.println("糖果售罄了");

    }

    @Override
    public void dispose() {
        System.out.println("糖果售罄了");

    }

    @Override
    public String toString() {
        return "SoldOutState{";
    }
}
