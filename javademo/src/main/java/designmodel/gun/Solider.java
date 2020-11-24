package designmodel.gun;

public class Solider {
    private AbstractGun gun;

    public void setGun(AbstractGun gun) {
        this.gun = gun;
    }

    public void killWithGun() {
        System.out.println("士兵杀人了");
        gun.shoot();
    }
}
