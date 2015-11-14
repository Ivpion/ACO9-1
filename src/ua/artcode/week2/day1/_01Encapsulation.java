package ua.artcode.week2.day1;

/**
 * Created by serhii on 14.11.15.
 */
public class _01Encapsulation {


    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("Vasia Pupkin",2000, "1234");
        BankAccount bankAccount2 = new BankAccount("Ivanon Ivan",4444);


        System.out.println(bankAccount1.getInfo());

        System.out.println(bankAccount1.getInfo("1234"));
    }


}
