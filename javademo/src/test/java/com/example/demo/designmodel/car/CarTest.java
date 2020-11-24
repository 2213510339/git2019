package com.example.demo.designmodel.car;

import designmodel.car.*;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.junit.jupiter.api.Test;

public class CarTest {

    Mockery mockery = new  JUnit4Mockery();
    @Test
    public void testCar() {
        CarService bmw = new BMW();
        DriverService driverService = new CarDriver();
        driverService.drive(bmw);
    }
    @Test
    public void testNoCar() {
        final CarService noCar = mockery.mock(CarService.class);
        DriverService driverService = new CarDriver();
        mockery.checking(new Expectations(){
            {
                oneOf (noCar).run();
            }
        });
        driverService.drive(noCar);
    }
    @Test
    public void testClassCar() {
        final Car noCar = mockery.mock(Car.class);
        DriverService driverService = new CarDriver();
        mockery.checking(new Expectations(){
            {
                oneOf (noCar).run();
            }
        });
        driverService.drive(noCar);
    }
}
