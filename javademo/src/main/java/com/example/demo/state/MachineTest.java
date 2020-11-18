package com.example.demo.state;

public class MachineTest {
    public static void main(String[] args) {
        Machine machine = new Machine(5);
        System.out.println(machine);
        // 投币, 退币,出糖
        machine.insertCoin();
        machine.refundCoin();
        machine.push();
        System.out.println(machine);
        // 投币出糖,退币
        machine.insertCoin();
        machine.push();
        machine.refundCoin();
        System.out.println(machine);

        // 反复横跳
        machine.insertCoin();
        machine.insertCoin();
        machine.refundCoin();
        machine.insertCoin();
        machine.push();
        machine.insertCoin();
        machine.push();
        System.out.println(machine);
    }
}
