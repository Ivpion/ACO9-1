package ua.artcode.design_patterns.strategy;

/**
 * Created by serhii on 19.12.15.
 */
public class GameCharacter {

    private IWeapon weapon;
    private int health;

    public IWeapon dropWeapon() {
        IWeapon forDrop = weapon;
        weapon = null;
        return forDrop;
    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }

    public void attack(GameCharacter enemy){
        enemy.health -= weapon != null ? weapon.use() : 10;
    }
}
