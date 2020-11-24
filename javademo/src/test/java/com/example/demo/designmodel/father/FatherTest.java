package com.example.demo.designmodel.father;

import designmodel.father.Son;
import designmodel.father.Father;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class FatherTest {
    @Test
    public void testFatherAndSon(){
        Father f= new Father();
        HashMap map = new HashMap();
        f.getMapValue(map);
        f.getHashMapValue(map);
        Son son =new Son();
        son.getMapValue(map);
        son.getHashMapValue(map);
    }
}
