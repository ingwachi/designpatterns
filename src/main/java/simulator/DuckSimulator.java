package simulator;

import Goose.GooseAdapter;
import Pigeon.PigeonAdapter;
import ducks.DuckCall;
import ducks.MallardDuck;
import ducks.RedHeadDuck;
import ducks.RubberDuck;
import quack.QuackCounter;
import quack.QuackEcho;
import quack.Quackable;
import Goose.Goose;
import  Pigeon.Pigeon;

public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }
    void simulate() {
        Quackable mallardDuck = new QuackCounter(new MallardDuck()) ;
        Quackable redheadDuck = new QuackCounter(new RedHeadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        Quackable gooseDuck = new GooseAdapter(new Goose());
        Quackable pigeon = new PigeonAdapter(new Pigeon());
        Quackable DuckWithEcho = new QuackCounter(new QuackEcho(new MallardDuck()));
        Quackable DuckWithEcho2 = new QuackEcho(new QuackCounter(new MallardDuck()));
        System.out.println("\nDuck Simulator");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
        simulate(pigeon);
        simulate(DuckWithEcho);
        simulate(DuckWithEcho2);
        System.out.println("The ducks quacked " +
                QuackCounter.getQuacks() + " times");
    }
    void simulate(Quackable duck) {
        duck.quack();
    }
}
