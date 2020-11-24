package uml;

public class Pig implements Animal {
    @Override
    public void say() {
        System.out.println("我是 Pig");
    }


    public void eat() {
        System.out.println("我要被吃了");
    }
}
