package lab8.decorator;

public class Main {
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        duckSimulator.addQuackbleCreature(new QuackCounterDecorator(new RubberDuck()));
        duckSimulator.addQuackbleCreature(new QuackCounterDecorator(new RedheadDuck()));
        duckSimulator.addQuackbleCreature(new QuackCounterDecorator(new MallardDuck()));
        duckSimulator.addQuackbleCreature(new HonkAdaptor(new Goose()));
        duckSimulator.addQuackbleCreature(new QuackEchoDecorator(new RubberDuck()));
        duckSimulator.addQuackbleCreature(new QuackCounterDecorator(new QuackEchoDecorator(new MallardDuck())));
        duckSimulator.addQuackbleCreature(new QuackEchoDecorator(new QuackCounterDecorator(new MallardDuck())));
        duckSimulator.allQuack();

        System.out.println(QuackCounterDecorator.getQuackCounter());
    }
}
