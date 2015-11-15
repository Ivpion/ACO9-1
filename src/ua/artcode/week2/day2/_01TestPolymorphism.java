package ua.artcode.week2.day2;

import ua.artcode.week2.bank.Coder;
import ua.artcode.week2.bank.Employee;
import ua.artcode.week2.bank.Tester;

/**
 * Created by serhii on 15.11.15.
 */
public class _01TestPolymorphism {


    public static void main(String[] args) {

        Employee employee = new Tester();
        employee.toString();

        // a lot of code



        employee.work();


        doWork(new Tester());
        doWork(new Coder());

    }


    public static void doWork(Employee employee){
        employee.work();
    }
}
