package lab8.abstractfactory;

public class HonkAdaptor implements Quackable {
    private Honkable honkable;

    public HonkAdaptor(Honkable honkable) {
        this.honkable = honkable;
    }

    @Override
    public void quack() {
        honkable.honk();
    }
}
