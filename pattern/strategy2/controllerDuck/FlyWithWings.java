package pattern.strategy2.controllerDuck;

import pattern.strategy2.controllerDuck.realizationDuck.IFlyBehavior;

public class FlyWithWings implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can’t fly");
    }
}
