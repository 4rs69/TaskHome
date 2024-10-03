package pattern.strategy2.controllerDuck;

import pattern.strategy2.controllerDuck.realizationDuck.IQuackBehavior;

public class Squeak implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("Разные утки пищат");
    }
}
