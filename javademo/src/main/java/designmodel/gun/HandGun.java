package designmodel.gun;

public class HandGun extends AbstractGun {
    @Override
    void shoot() {
        System.out.println("使用手枪射击");
    }
}
