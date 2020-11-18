package com.example.demo.state;

public class Machine {
    // 售罄
    final static int SOLD_OUT = 0;
    // 没有投币
    final static int NO_COIN = 1;
    // 投币
    final static int HAS_COIN = 2;
    // 售出
    final static int SOLD = 3;
    // 数量
     int count = 0;
     // 初始状态
     int state = SOLD_OUT;
     // 初始化
     public Machine(int count) {
         this.count = count;
         if (count > 0) {
             state = NO_COIN;
         }
     }

     // 投币
    public void insertCoin() {
         if (state == HAS_COIN) {
             System.out.println("已经投过,不用再投");
         }
         else if (state ==NO_COIN) {
             state = HAS_COIN;
             System.out.println("投币成功");
         }
         else if(state == SOLD_OUT) {
             System.out.println("已售完");
         }
         else if(state == SOLD) {
             System.out.println("请等待状态转换");
         }
    }
    // 退钱
    public void refundCoin() {
        if (state == HAS_COIN) {
            state = NO_COIN;
            System.out.println("退出成功");
        }
        else if (state ==NO_COIN) {
            System.out.println("你没有投币");
        }
        else if(state == SOLD_OUT) {
            System.out.println("你没有投币");
        }
        else if(state == SOLD) {
            System.out.println("你没有投币");
        }
    }
    // 出糖果
    public void push() {
        if (state == HAS_COIN) {
            state = SOLD;
            System.out.println("正在出糖");
            dispose();
        }
        else if (state ==NO_COIN) {
            System.out.println("你没有投币");
        }
        else if(state == SOLD_OUT) {
            System.out.println("已售罄");
        }
        else if(state == SOLD) {
            System.out.println("你已经拿到了");
        }
    }

    private void dispose() {
        if (state == HAS_COIN) {
            System.out.println("不支持的操作");

        }
        else if (state ==NO_COIN) {
            System.out.println("你没有投币");
        }
        else if(state == SOLD_OUT) {
            System.out.println("已售罄");
        }
        else if(state == SOLD) {
            System.out.println("出糖中...");
            count = count - 1;
            if (count == 0) {
                state = SOLD_OUT;
            }
            else {
                state = NO_COIN;
            }
        }
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Machine{" +
                "count=" + count +
                ", state=" + state +
                '}';
    }
}
