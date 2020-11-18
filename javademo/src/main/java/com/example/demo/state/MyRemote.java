package com.example.demo.state;

import com.example.demo.state.State;

import java.rmi.Remote;
import java.rmi.RemoteException;
public interface MyRemote  extends Remote {
    public int getCount() throws RemoteException;
    public String getLocation() throws RemoteException;
    public String sayHello() throws RemoteException;
    public State getState() throws RemoteException;
}
