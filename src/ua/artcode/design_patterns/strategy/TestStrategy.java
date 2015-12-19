package ua.artcode.design_patterns.strategy;

/**
 * Created by serhii on 19.12.15.
 */
public class TestStrategy {


    public static void main(String[] args) {
        GameCharacter gameCharacter = new GameCharacter();
        GameCharacter troll = new GameCharacter();

        Sword sword = new Sword();
        Knife knife = new Knife();
        Axe axe = new Axe();

        gameCharacter.setWeapon(sword);

        gameCharacter.attack(troll);
        troll.attack(gameCharacter);

        gameCharacter.setWeapon(axe);
        gameCharacter.attack(troll);


    }
}
