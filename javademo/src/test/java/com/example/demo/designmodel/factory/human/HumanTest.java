package com.example.demo.designmodel.factory.human;

import designmodel.factory.human.*;
import org.junit.Test;

public class HumanTest {
    @Test
    public void testAbstractFactory(){
        AbstractHumanFactory humanFactory = new HumanFactory();
        HumanService yellow = humanFactory.createHuman(YellowHuman.class);
        HumanService white = humanFactory.createHuman(WhiteHuman.class);
        yellow.description();
        white.description();
        HumanService black = humanFactory.createHuman(BlackHuman.class);
        black.description();
    }
}
