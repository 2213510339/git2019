package designmodel.car;

public class Benz  implements CarService{
    @Override
    public void run() {
        System.out.println("Benz run");
    }
}
