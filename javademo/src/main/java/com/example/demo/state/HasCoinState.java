package com.example.demo.state;

import java.util.Random;

public class HasCoinState implements State{

    transient MachinePuls machine;
    // 幸运儿
    Random luckDog = new Random(System.currentTimeMillis());
    public HasCoinState(MachinePuls machine) {
        this.machine = machine;
    }
    @Override
    public void insertCoin() {
        System.out.println("已经投过了");
    }

    @Override
    public void refuseCoin() {
        machine.setState(machine.getNoCoinState());
        System.out.println("退出完成");
    }

    @Override
    public void pushCrank() {
        System.out.println("准备拿糖果...");
        int winner = luckDog.nextInt(10);
        System.out.println(luckDog + "winner:" +  winner);
        if ((winner == 0) && (machine.getCount() > 1)) {
            machine.setState(machine.getWinnerState());
        }
        else {
            machine.setState(machine.getSoldState());
        }

    }

    @Override
    public void dispose() {
        System.out.println("不允许的操作");
    }

    @Override
    public String toString() {
        return "HasCoinState";
    }
}
