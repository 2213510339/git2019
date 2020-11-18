package com.example.demo.compound;

public class DuckSimulatorWithAbstrc {
    public static void main(String[] args) {
        DuckSimulatorWithAbstrc simulator = new DuckSimulatorWithAbstrc();
        AbstrcDuckFactory duckFactory = new CountingDuckFactory();
        AbstractGooseFactory gooseFactory = new GooseFactory();
        simulator.simulate(duckFactory);
//        simulator.simulate(gooseFactory);
    }
    void simulate(AbstrcDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redHeadDuck = duckFactory.createRedHeadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
//        System.out.println(" Duck Simulator: with Abstract Factoey");
//        simulate(mallardDuck);
//        simulate(redHeadDuck);
//        simulate(duckCall);
//        simulate(rubberDuck);
        System.out.println("quack count: >" + QuackCounter.getQucakCount());
//        System.out.println("=============flock duck=====================");
        Flock flockOfDuck = new Flock();
        flockOfDuck.add(mallardDuck);
        flockOfDuck.add(redHeadDuck);
        flockOfDuck.add(duckCall);
        flockOfDuck.add(rubberDuck);
        Flock flockOfMallard = new Flock();
        Quackable mallardDuck1 = duckFactory.createMallardDuck();
        Quackable mallardDuck2 = duckFactory.createMallardDuck();
        Quackable mallardDuck3 = duckFactory.createMallardDuck();
        Quackable mallardDuck4 = duckFactory.createMallardDuck();
        flockOfMallard.add(mallardDuck1);
        flockOfMallard.add(mallardDuck2);
        flockOfMallard.add(mallardDuck3);
        flockOfMallard.add(mallardDuck4);
//        simulate(flockOfDuck);
//        simulate(flockOfMallard);
//        System.out.println("quack count: >" + QuackCounter.getQucakCount());
        Quacklogist quacklogist = new Quacklogist();
        flockOfDuck.registerObserver(quacklogist);
        simulate(flockOfDuck);
        System.out.println("quack with observer");
        System.out.println("quack count: >" + QuackCounter.getQucakCount());

    }
    void simulate(AbstractGooseFactory gooseFactory) {
        Quackable gooseDuck = new GooseAdapter(gooseFactory.createGoose());
        System.out.println(" gooseDuck Simulator: with Abstract Factoey");
        simulate(gooseDuck);
    }
    void simulate(Quackable duck) {
        duck.quack();
    }
}
