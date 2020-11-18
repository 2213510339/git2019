package com.example.demo.state;

public class NoCoinState implements State{

    transient MachinePuls machine;
    public NoCoinState(MachinePuls machine) {
        this.machine = machine;
    }
    @Override
    public void insertCoin() {
        machine.setState(machine.getHasCoinState());
        System.out.println("投币成功");
    }

    @Override
    public void refuseCoin() {
        System.out.println("你还没有投币");
    }

    @Override
    public void pushCrank() {
        System.out.println("你还没有投币");

    }

    @Override
    public void dispose() {
        System.out.println("你还没有投币");

    }

    @Override
    public String toString() {
        return "NoCoinState{";
    }
}
