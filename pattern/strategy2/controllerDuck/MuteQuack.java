package pattern.strategy2.controllerDuck;

import pattern.strategy2.controllerDuck.realizationDuck.IQuackBehavior;

public class MuteQuack implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("Я не квакаю");
    }
}
