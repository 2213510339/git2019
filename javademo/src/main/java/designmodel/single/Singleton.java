package designmodel.single;

public class Singleton {
    private static Singleton single = new Singleton();
    private static int count;
    private Singleton(){}
    public static Singleton getInstance(){
        return single;
    }
    public static void say(){
        System.out.println("我是" + single);
        count++;
    }
    public static int getCount() {
        return count;
    }
}
