package ua.artcode.week2.bank;

import ua.artcode.week2.day1.BankAccount;

/**
 * Created by serhii on 14.11.15.
 */
public class TestBank {


    public static void main(String[] args) {
        Bank bank = new Bank(20);
        bank.createAccount("Kolia",200,"1234");

        BankAccount bankAccount = bank.login("Kolia", "1234");
        double money = bankAccount.withdraw(23);

    }
}
