package lab8.composite;

public class DuckCountingAndEchoFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounterDecorator(new QuackEchoDecorator(new MallardDuck()));
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounterDecorator(new QuackEchoDecorator(new RedheadDuck()));
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounterDecorator(new QuackEchoDecorator(new RubberDuck()));
    }
}
