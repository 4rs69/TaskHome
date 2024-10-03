package pattern.strategy2.controllerDuck;

import pattern.strategy2.controllerDuck.realizationDuck.IFlyBehavior;

public class FlyNoWay implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("Я не умею плавать");
    }
}
