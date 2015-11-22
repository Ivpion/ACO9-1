package ua.artcode.week3.day2;

/**
 * Created by serhii on 22.11.15.
 */
public class MortalCombatTest {

    public static void main(String[] args) {
        String res = Arena.startFight(new Mag(30, 100, 20), new Mag(20, 100, 40));
        System.out.println(res);
    }

}


class Arena {



    public static String startFight(Fighter one, Fighter second){

        while(one.getHealth() > 0 || second.getHealth() > 0){

            one.hit(second);
            if(second.getHealth() <= 0){
                System.out.println("One won");
                break;
            }


            second.hit(one);
            if(second.getHealth() <= 0){
                System.out.println("Second won");
                break;
            }


        }
        return String.format("After fight one %s, second %s", one, second);

    }


}

abstract class Fighter {


    protected int health;
    protected int damage;

    public Fighter(int damage, int health) {
        this.damage = damage;
        this.health = health;
    }

    // retrutn true if Figher still alive after
    public boolean takeDamage(int damage){

        health-= damage;

        return health <= 0;
    }

    @Override
    public String toString() {
        return "Fighter{" +
                "damage=" + damage +
                ", health=" + health +
                '}';
    }

    public abstract int hit(Fighter enemy);

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }
}

class Mag extends Fighter {

    private int manna;

    public Mag(int damage, int health, int manna) {
        super(damage, health);
        this.manna = manna;
    }

    @Override
    public int hit(Fighter enemy) {
        return enemy.health -= calculateDamage();
    }

    private int calculateDamage(){
        return manna + damage;
    }
}
