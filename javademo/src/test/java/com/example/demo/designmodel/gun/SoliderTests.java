package com.example.demo.designmodel.gun;

import designmodel.gun.HandGun;
import designmodel.gun.MarchineGun;
import designmodel.gun.Solider;
import org.junit.jupiter.api.Test;

public class SoliderTests {
    @Test
    public void testShoot(){
        Solider solider = new Solider();
        solider.setGun(new HandGun());
        solider.killWithGun();
        solider.setGun(new MarchineGun());
        solider.killWithGun();
    }
}
