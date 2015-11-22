package ua.artcode.week2.bank;

import ua.artcode.utils.TimeAction;

/**
 * Created by serhii on 14.11.15.
 */
public class Coder extends Employee implements TimeAction {

    private String programmingLanguage;

    public Coder() {
    }

    public Coder(String name, int age, String code, double cash, String programmingLanguage) {
        super(name, age, code, cash);
        this.programmingLanguage = programmingLanguage;
    }

    public void work(){
        System.out.println("Coder works");
    }

    public void code(){
        System.out.println("Coder code");
    }

    @Override
    public void callWrappedAction() {
        code();
    }
}
