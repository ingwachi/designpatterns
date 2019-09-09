package Abstract;

import ducks.DuckCall;
import ducks.MallardDuck;
import ducks.RedHeadDuck;
import ducks.RubberDuck;
import quack.QuackCounter;
import quack.QuackEcho;
import quack.Quackable;

public class EchoDuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new QuackEcho(new QuackCounter(new MallardDuck()));
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackEcho(new QuackCounter(new RedHeadDuck()));
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackEcho(new QuackCounter(new DuckCall()));
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackEcho(new QuackCounter(new RubberDuck()));
    }
}
