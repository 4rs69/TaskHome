package pattern.strategy2.taskPatternStrategy.heroes;

import pattern.strategy2.taskPatternStrategy.Character;

public class Troll extends Character {
    @Override
    public void fight() {
        weapon.useWeapon();
    }
}
