package com.example.demo.proxy;

public class GumbalMonitor {
    GallMeachine gallMeachine;
    public GumbalMonitor(GallMeachine gallMeachine) {
        this.gallMeachine = gallMeachine;
    }
    public void report () {
        System.out.println(gallMeachine);
        System.out.println("机器位置: " + gallMeachine.getLocation());
        System.out.println("机器状态: " + gallMeachine.getState());
        System.out.println("剩余数量: " + gallMeachine.getCount());
    }
}
