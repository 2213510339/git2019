package com.example.demo.proxy;

import com.example.demo.state.*;

import java.rmi.RemoteException;

public class GallMeachine  extends MachinePuls{

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
        // 初始状态
        State state = soldOutState;
        // 位置
        String location;
        // 初始化
        public GallMeachine(int count, String location) throws RemoteException{
            soldOutState = new SoldOutState(this);
            soldState = new SoldState(this);
            noCoinState = new NoCoinState(this);
            hasCoinState = new HasCoinState(this);
            winnerState = new WinnerState(this);
            this.location = location;
            this.count = count;
            if (count > 0) {
                state = noCoinState;
            }
        }

    @Override
    public int getCount()  {
        return count;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public State getState()  {
        return state;
    }

    @Override
    public String toString() {
        return "GallMeachine{" +
                "count=" + count +
                ", state=" + state +
                ", location='" + location + '\'' +
                '}';
    }
}
