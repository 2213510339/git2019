package com.example.demo.state;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MachinePuls  extends UnicastRemoteObject implements MyRemote {
    // 售罄
    State soldOutState;
    // 没有投币
    State noCoinState;
    // 投币
    State hasCoinState;
    // 售出
    State soldState;
    // 中奖
    State winnerState;
    // 数量
     int count = 0;
    // 位置
    String location;
     // 初始状态
     State state = soldOutState;
    public MachinePuls() throws RemoteException{}
     // 初始化
     public MachinePuls(int count, String location) throws RemoteException {
         soldOutState = new SoldOutState(this);
         soldState = new SoldState(this);
         noCoinState = new NoCoinState(this);
         hasCoinState = new HasCoinState(this);
         winnerState = new WinnerState(this);
         this.count = count;
         this.location = location;
         if (count > 0) {
             state = noCoinState;
         }
     }

     // 投币
    public void insertCoin() {
        state.insertCoin();
    }
    // 退钱
    public void refundCoin() {
        state.refuseCoin();
    }
    // 出糖果
    public void push() {
       state.pushCrank();
       state.dispose();
    }
    public void releaseCount() {
        System.out.println("正在出一颗糖");
         if (count  != 0) {
             count = count -1;
         }
    }
    // 填充
    public void refill(int count) {
         this.count = count;
         state = noCoinState;
    }
    public int getCount() {
        return count;
    }

    @Override
    public String getLocation() throws RemoteException {
        return location;
    }

    @Override
    public String sayHello() throws RemoteException {
        return "hello";
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public void setNoCoinState(State noCoinState) {
        this.noCoinState = noCoinState;
    }

    public State getHasCoinState() {
        return hasCoinState;
    }

    public void setHasCoinState(State hasCoinState) {
        this.hasCoinState = hasCoinState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public void setWinnerState(State winnerState) {
        this.winnerState = winnerState;
    }

    @Override
    public String toString() {
        return "MachinePuls{" +
                ", count=" + count +
                ", state=" + state +
                '}';
    }
}
