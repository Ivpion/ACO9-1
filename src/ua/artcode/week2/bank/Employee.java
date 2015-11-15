package ua.artcode.week2.bank;

/**
 * Created by serhii on 14.11.15.
 */
public class Employee extends User {

    private double money;

    public Employee() {
        super();
    }

    public Employee(String name, int age, String code, double cash){
        super(age,code,name);
        this.money = cash;
    }

    public void work(){
        System.out.println("Employee work");
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String toString(){
        return  String.format("Hi im employee - name %s, age %d, salary %.2f",
                getName(), getAge(), getMoney());
    }
}
