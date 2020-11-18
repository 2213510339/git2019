package com.example.demo.state;

import java.io.Serializable;

public interface State extends Serializable {
    void insertCoin();
    void refuseCoin();
    void pushCrank();
    void dispose();
}
