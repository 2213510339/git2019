package designmodel.father;

import java.util.*;

public class Father {

    public void  getHashMapValue(HashMap map) {
        System.out.println("father hashMap");
    }
    public void getMapValue(Map map) {
        System.out.println("father map ");
    }
    public List getList() {
        System.out.println("father list ");
        return new ArrayList();
    }
    public ArrayList getList(String str) {
        return new ArrayList();
    }

}
