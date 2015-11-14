package ua.artcode.week2.day1;

import ua.artcode.week2.bank.Coder;
import ua.artcode.week2.bank.Employee;
import ua.artcode.week2.bank.Tester;
import ua.artcode.week2.bank.User;

/**
 * Created by serhii on 14.11.15.
 */
public class TestAbstraction {

    public static void main(String[] args) {
        Employee employee = new Employee();

        // Employee is User

        // abstraction
        User user = new Employee();

        testUser(employee);

    }

    public static void testUser(User user){
        System.out.println(user.getName());
    }

    public static void checkType(User user){
        // instanceof

        if (user instanceof Coder){
            System.out.println("Coder");
        } else if(user instanceof Tester){
            System.out.println("Test");
        } else if(user instanceof Employee){
            System.out.println("Employee");
        }
    }
}
