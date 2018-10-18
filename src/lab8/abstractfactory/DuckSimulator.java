package lab8.abstractfactory;


import java.util.ArrayList;
import java.util.List;

public class DuckSimulator {
    private List<Quackable> quackableCreatures = new ArrayList<>();

    public void addQuackbleCreature(Quackable creature) {
        quackableCreatures.add(creature);
    }

    public void allQuack() {
        quackableCreatures.forEach(Quackable::quack);
    }
}
