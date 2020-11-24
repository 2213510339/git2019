package designmodel.car;

public class BMW implements CarService {
    @Override
    public void run() {
        System.out.println("BMW run");
    }
}
