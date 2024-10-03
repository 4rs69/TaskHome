package pattern.strategy2.controllerDuck;

import pattern.strategy2.controllerDuck.realizationDuck.IFlyBehavior;

public class FlyRocketPowered implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
