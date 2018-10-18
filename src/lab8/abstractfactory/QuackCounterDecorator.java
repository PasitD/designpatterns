package lab8.abstractfactory;

public class QuackCounterDecorator implements Quackable {
    private static int quackCounter = 0;
    private Quackable duck;

    public QuackCounterDecorator(Quackable duck) {
        this.duck = duck;
    }

    public static int getQuackCounter() {
        return quackCounter;
    }

    @Override
    public void quack() {
        duck.quack();
        quackCounter++;
    }
}
