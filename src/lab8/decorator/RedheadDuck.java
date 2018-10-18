package lab8.decorator;

public class RedheadDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("red head quack quack");
    }
}
