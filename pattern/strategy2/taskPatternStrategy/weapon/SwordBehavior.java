package pattern.strategy2.taskPatternStrategy.weapon;

public class SwordBehavior implements IWeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Удар мечом");
    }
}

