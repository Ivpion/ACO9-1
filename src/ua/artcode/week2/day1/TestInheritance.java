package ua.artcode.week2.day1;

import ua.artcode.week2.bank.Employee;

public class TestInheritance {


    public static void main(String[] args) {
        Employee employee = new Employee("Yura", 25, "87237", 2000);

        employee.getCode();
        employee.setMoney(2349);

    }
}
