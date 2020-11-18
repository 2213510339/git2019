package com.example.demo.proxy;

import com.example.demo.state.MyRemote;
import com.example.demo.state.State;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl  extends UnicastRemoteObject implements MyRemote {
    protected MyRemoteImpl() throws RemoteException {
    }

    @Override
    public int getCount() throws RemoteException {
        return 0;
    }

    @Override
    public String getLocation() throws RemoteException {
        return null;
    }

    @Override
    public String sayHello() throws RemoteException {
        return "remote say hello";
    }

    @Override
    public State getState() throws RemoteException {
        return null;
    }

    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("RemoteHello", service);
            System.out.println(" remote service is ready");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
