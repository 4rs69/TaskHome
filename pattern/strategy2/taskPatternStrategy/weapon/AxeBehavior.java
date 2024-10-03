package pattern.strategy2.taskPatternStrategy.weapon;

public class AxeBehavior implements IWeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Удар топором");
    }

}