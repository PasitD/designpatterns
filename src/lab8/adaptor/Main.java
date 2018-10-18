package lab8.adaptor;

public class Main {
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        duckSimulator.addQuackbleCreature(new RubberDuck());
        duckSimulator.addQuackbleCreature(new HonkAdaptor(new Goose()));
        duckSimulator.allQuack();
    }
}
