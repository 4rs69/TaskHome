package pattern.strategy2.subClassDuck;

import pattern.strategy2.abstractDuck.Duck;
import pattern.strategy2.controllerDuck.FlyWithWings;
import pattern.strategy2.controllerDuck.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }

}
