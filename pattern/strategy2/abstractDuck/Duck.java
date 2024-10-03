package pattern.strategy2.abstractDuck;

import pattern.strategy2.controllerDuck.realizationDuck.IFlyBehavior;
import pattern.strategy2.controllerDuck.realizationDuck.IQuackBehavior;

public abstract class Duck {
    protected IFlyBehavior flyBehavior;
    protected IQuackBehavior quackBehavior;

    public void swim() {
        System.out.println("я плаваю");
    }

    public void display() {
        System.out.println("я отображась");
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public IFlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public IQuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
