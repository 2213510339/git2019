package com.example.demo.state;

public class WinnerState implements State{

    transient MachinePuls machine;
    public WinnerState(MachinePuls machine) {
        this.machine = machine;
    }
    @Override
    public void insertCoin() {
        System.out.println("非法操作");
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
        System.out.println("恭喜你,白嫖到一颗糖");
        machine.releaseCount();
        System.out.println("第一课");

        if (machine.getCount() == 0) {
            machine.setState(machine.getSoldOutState());
        }
        else {
            machine.releaseCount();
            System.out.println("第二课");
            if (machine.getCount() > 0) {
                machine.setState(machine.getNoCoinState());
            }
            else {
                machine.setState(machine.getSoldOutState());
            }
        }
    }
}
