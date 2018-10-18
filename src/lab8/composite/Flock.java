package lab8.composite;


import java.util.ArrayList;
import java.util.List;

public class Flock {
    private List<Quackable> quackableCreatures = new ArrayList<>();

    public void addQuackbleCreature(Quackable creature) {
        quackableCreatures.add(creature);
    }

    public void allQuack() {
        if (!quackableCreatures.isEmpty()) {
            quackableCreatures.get(0).quack();
            quackableCreatures.get(0).quack();
        }
        quackableCreatures.forEach(Quackable::quack);
    }
}
