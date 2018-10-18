package lab8.adaptor;

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
