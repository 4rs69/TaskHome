package pattern.strategy2.taskPatternStrategy;

import pattern.strategy2.taskPatternStrategy.weapon.IWeaponBehavior;

public abstract class Character {

    protected IWeaponBehavior weapon;

    public void fight() {
    }

    public void setWeapon(IWeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
