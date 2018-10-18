package lab8.decorator;

public class RubberDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Squeak Squeak");
    }
}
