package pattern.strategy2.taskPatternStrategy.heroes;

import pattern.strategy2.taskPatternStrategy.Character;
import pattern.strategy2.taskPatternStrategy.weapon.IWeaponBehavior;

public class King extends Character {
    @Override
    public void fight() {
        super.fight();
    }

    @Override
    public void setWeapon(IWeaponBehavior weapon) {
        super.setWeapon(weapon);
    }
}

