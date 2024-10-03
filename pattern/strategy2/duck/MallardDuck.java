package pattern.strategy2.duck;

import pattern.strategy2.abstractDuck.Duck;
import pattern.strategy2.controllerDuck.FlyWithWings;
import pattern.strategy2.controllerDuck.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void swim() {
        super.swim();
    }

    @Override
    public void display() {
        super.display();
    }

    @Override
    public void performFly() {
        System.out.println("I’m flying!!");
    }

    @Override
    public void performQuack() {
        System.out.println("Quack");
    }

}
