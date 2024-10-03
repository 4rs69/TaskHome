package pattern.strategy2.taskPatternStrategy.weapon;

public class BowAndArrowBehavior implements IWeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Выстрел из лука");
    }
}
