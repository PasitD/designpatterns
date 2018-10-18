package lab8.abstractfactory;

public class Main {
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        AbstractDuckFactory duckCountingFactory = new DuckCountingFactory();
        duckSimulator.addQuackbleCreature(duckCountingFactory.createMallardDuck());
        duckSimulator.addQuackbleCreature(duckCountingFactory.createRedheadDuck());
        duckSimulator.addQuackbleCreature(duckCountingFactory.createRubberDuck());
        AbstractDuckFactory duckFactory = new DuckFactory();
        duckSimulator.addQuackbleCreature(duckFactory.createMallardDuck());
        duckSimulator.addQuackbleCreature(duckFactory.createRedheadDuck());
        duckSimulator.addQuackbleCreature(duckFactory.createRubberDuck());
        AbstractDuckFactory countingAndEchoFactory = new DuckCountingAndEchoFactory();
        duckSimulator.addQuackbleCreature(countingAndEchoFactory.createMallardDuck());
        duckSimulator.addQuackbleCreature(countingAndEchoFactory.createRedheadDuck());
        duckSimulator.addQuackbleCreature(countingAndEchoFactory.createRubberDuck());
        duckSimulator.allQuack();

        System.out.println(QuackCounterDecorator.getQuackCounter());
    }
}
