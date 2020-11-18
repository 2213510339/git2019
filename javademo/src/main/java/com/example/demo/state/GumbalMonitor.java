package com.example.demo.state;

import com.example.demo.proxy.GallMeachine;

public class GumbalMonitor {
    MyRemote gallMeachine;
    public GumbalMonitor(MyRemote gallMeachine) {
        this.gallMeachine = gallMeachine;
    }
    public void report () {
        try {
            System.out.println(gallMeachine);
            System.out.println("机器位置: " + gallMeachine.getLocation());
            System.out.println("机器状态: " + gallMeachine.getState());
            System.out.println("剩余数量: " + gallMeachine.getCount());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
