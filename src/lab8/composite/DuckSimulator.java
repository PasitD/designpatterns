package lab8.composite;

public class DuckSimulator {
    public static void main(String[] args) {
        Flock flock = new Flock();
        AbstractDuckFactory duckCountingFactory = new DuckCountingFactory();
        flock.addQuackbleCreature(duckCountingFactory.createMallardDuck());
        flock.addQuackbleCreature(duckCountingFactory.createRedheadDuck());
        flock.addQuackbleCreature(duckCountingFactory.createRubberDuck());
        AbstractDuckFactory duckFactory = new DuckFactory();
        flock.addQuackbleCreature(duckFactory.createMallardDuck());
        flock.addQuackbleCreature(duckFactory.createRedheadDuck());
        flock.addQuackbleCreature(duckFactory.createRubberDuck());
        AbstractDuckFactory countingAndEchoFactory = new DuckCountingAndEchoFactory();
        flock.addQuackbleCreature(countingAndEchoFactory.createMallardDuck());
        flock.addQuackbleCreature(countingAndEchoFactory.createRedheadDuck());
        flock.addQuackbleCreature(countingAndEchoFactory.createRubberDuck());
        flock.allQuack();

        System.out.println(QuackCounterDecorator.getQuackCounter());
    }
}
