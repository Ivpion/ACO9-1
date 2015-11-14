package ua.artcode.week2.bank;

/**
 * Created by serhii on 14.11.15.
 */
public class Manager extends Employee {

    // ArrayList -> []
    private Coder[] coders;
    private Tester[] testers;


    public Manager(String name, int age, String code, double cash) {
        super(name, age, code, cash);
    }

    public void addCoder(Coder coder){

    }

    public void addTester(Tester tester){

    }


    // replace by polymorphism -> 
    public void doWork(Employee employee){
        if (employee instanceof Coder){
            Coder coder = (Coder) employee;
            // create ref = cast from Empl to Coder (refernce)
            coder.code();
        } else if(employee instanceof Tester){
            System.out.println("Test");
            ((Tester) employee).test();
        }
    }



}
