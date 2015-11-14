package ua.artcode.week2.bank;

/**
 * Created by serhii on 14.11.15.
 */
public class Coder extends Employee {

    private String programmingLanguage;

    public Coder(String name, int age, String code, double cash, String programmingLanguage) {
        super(name, age, code, cash);
        this.programmingLanguage = programmingLanguage;
    }

    public void code(){
        System.out.println("Coder code");
    }

}
