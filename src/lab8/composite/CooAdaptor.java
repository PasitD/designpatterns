package lab8.composite;

public class CooAdaptor implements Quackable {
    private Cooable cooable;

    public CooAdaptor(Cooable cooable) {
        this.cooable = cooable;
    }

    @Override
    public void quack() {
        cooable.coo();
        cooable.coo();
    }
}
