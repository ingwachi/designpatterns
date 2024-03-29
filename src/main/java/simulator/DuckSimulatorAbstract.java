package simulator;

import Abstract.AbstractDuckFactory;
import Abstract.CountingDuckFactory;
import Abstract.EchoDuckFactory;
import Goose.GooseAdapter;
import quack.QuackCounter;
import quack.Quackable;
import Goose.Goose;

public class DuckSimulatorAbstract {
    public static void main(String[] args) {
        DuckSimulatorAbstract simulatorAb = new DuckSimulatorAbstract();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        AbstractDuckFactory duckFactoryEcho = new EchoDuckFactory();
        simulatorAb.simulate(duckFactory);
        simulatorAb.simulateEcho(duckFactoryEcho);
    }
    void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        System.out.println("\nDuck Simulator: With Abstract Factory");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
        System.out.println("The ducks quacked " +
                QuackCounter.getQuacks() + " times");
    }

    void simulateEcho(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        System.out.println("\nDuck Simulator: With Abstract Factory and Echo");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
        System.out.println("The ducks quacked " +
                QuackCounter.getQuacks() + " times");
    }


    void simulate(Quackable duck) {
        duck.quack();
    }
}
