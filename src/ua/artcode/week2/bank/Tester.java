package ua.artcode.week2.bank;

/**
 * Created by serhii on 14.11.15.
 */
public class Tester extends Employee {

    private String type;

    public Tester(String name, int age, String code, double cash, String type) {
        super(name, age, code, cash);
        this.type = type;
    }

    public void test(){
        System.out.println("Tester test");
    }

}
