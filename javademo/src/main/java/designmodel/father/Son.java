package designmodel.father;

import java.util.*;

public class Son extends Father{
    public void SayDad() {
        System.out.println("叫爸爸");
    }
    public void getHashMapValue(Map map) {
        System.out.println("son hashMap");
    }

    public void getMapValue(HashMap map) {
        System.out.println("son map ");
    }

    @Override
    public ArrayList getList() {
        return new ArrayList();
    }
    @Override
    public ArrayList getList(String str) {
        return new ArrayList();
    }
}
