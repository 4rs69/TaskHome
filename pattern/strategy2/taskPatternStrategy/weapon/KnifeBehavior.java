package pattern.strategy2.taskPatternStrategy.weapon;

public class KnifeBehavior implements IWeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Удар ножом");
    }
}
