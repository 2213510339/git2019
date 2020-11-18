package com.example.demo.proxy;

import java.rmi.RemoteException;

public class TestMonitor {
    public static void main(String[] args) throws RemoteException {
        GallMeachine gallMeachine = new GallMeachine(10, "上海");
        System.out.println(gallMeachine);
        GumbalMonitor gumbalMonitor = new GumbalMonitor(gallMeachine);
        gumbalMonitor.report();
    }

}
