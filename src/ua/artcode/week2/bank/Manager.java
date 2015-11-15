package ua.artcode.week2.bank;

/**
 * Created by serhii on 14.11.15.
 */
public class Manager extends Employee {

    private Employee[] team = new Employee[10];
    private int count;


    public Manager(String name, int age, String code, double cash) {
        super(name, age, code, cash);
    }

    // replace by polymorphism ->
    public void doWork(Employee employee) {
        if (employee instanceof Coder) {
            Coder coder = (Coder) employee;
            // create ref = cast from Empl to Coder (refernce)
            coder.code();
        } else if (employee instanceof Tester) {
            System.out.println("Test");
            ((Tester) employee).test();
        }
    }

    public void add(Employee employee){
        team[count++] = employee;
    }

    public void doTeamWork(){
        for (int i = 0; i < count; i++) {
            doWork(team[i]);
        }
    }




}
