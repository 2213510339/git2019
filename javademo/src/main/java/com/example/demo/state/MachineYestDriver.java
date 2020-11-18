package com.example.demo.state;

import java.rmi.Naming;

public class MachineYestDriver {
    public static void main(String[] args) {
        MyRemote  remote = null;
        int count;
        if (args.length < 2) {
            System.out.println("GumbalMachine <name> <inventory>");
            System.exit(1);
        }
        try {
            count = Integer.parseInt(args[1]);
            remote = new MachinePuls(count, args[0]);
            Naming.rebind("//" + args[0] + "gumballmachine", remote);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
