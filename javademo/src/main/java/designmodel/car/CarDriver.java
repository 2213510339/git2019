package designmodel.car;

public class CarDriver implements DriverService{
    @Override
    public void drive(CarService car) {
        car.run();
    }
}
