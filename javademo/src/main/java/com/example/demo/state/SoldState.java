package com.example.demo.state;

public class SoldState implements State{

    transient MachinePuls machine;
    public SoldState(MachinePuls machine) {
        this.machine = machine;
    }
    @Override
    public void insertCoin() {
        System.out.println("请等待,正在出糖果...");
    }

    @Override
    public void refuseCoin() {
        System.out.println("请等待,正在出糖果...");
    }

    @Override
    public void pushCrank() {
        System.out.println("请不要重复拉杆");

    }

    @Override
    public void dispose() {
        machine.releaseCount();
        if (machine.getCount() > 0) {
            machine.setState(machine.getNoCoinState());
        }
        else {
            machine.setState(machine.getSoldOutState());
        }
    }

    @Override
    public String toString() {
        return "SoldState{";
    }
}
