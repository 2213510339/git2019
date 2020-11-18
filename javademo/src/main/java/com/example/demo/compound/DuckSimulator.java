package com.example.demo.compound;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }
    void simulate() {
//        Quackable mallardDuck = new MallardDuck();
//        Quackable redHeadDuck = new RedHeadDuck();
//        Quackable duckCall = new DuckCall();
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable redHeadDuck = new QuackCounter(new RedHeadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        // 使用适配器
        Quackable gooseDuck = new GooseAdapter(new Goose());
        System.out.println("Duck Simulator");
        simulate(mallardDuck);
        simulate(redHeadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
        System.out.println("quack count: >" + QuackCounter.getQucakCount());
    }
    void simulate(Quackable duck) {
        duck.quack();
    }
}
