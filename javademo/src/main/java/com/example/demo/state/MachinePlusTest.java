package com.example.demo.state;

import java.rmi.RemoteException;

public class MachinePlusTest {
    public static void main(String[] args) throws RemoteException {
        MachinePuls machine = new MachinePuls(5, "武汉");
        System.out.println(machine);
        // 投币, 退币,出糖
        machine.insertCoin();
        machine.push();
        System.out.println(machine);
        // 投币出糖,退币
        machine.insertCoin();
        machine.push();
        System.out.println(machine);
        machine.insertCoin();
        machine.push();
        System.out.println(machine);
        // 反复横跳
        machine.insertCoin();
        machine.push();
        machine.insertCoin();
        machine.push();
        System.out.println(machine);
    }
}
