package ua.artcode.week2.bank;

import ua.artcode.week2.day1.BankAccount;

//
public class Bank {

    private BankAccount[] accounts;
    private int free = 0;

    public Bank() {
        accounts = new BankAccount[10];
    }

    public Bank(int size){
        accounts = new BankAccount[size];
    }

    // create account
    // show accounts
    // sort accounts
    // get account
    // delete account


    public void createAccount(String name, double cash, String pass){
        addNewFreeSpaceIfNeeded();

        accounts[free] = new BankAccount(name,cash,pass);
        free++;

    }

    public BankAccount login(String name, String pass){
        BankAccount found = findAccount(name);

        if(found == null){
            System.out.println("Wrong user name");
            return null;
        }

        if(found.checkPass(pass)){
            return found;
        }

        System.out.println("Pass is wrong");
        return null;
    }

    private BankAccount findAccount(String name){
        for (int i = 0; i < free; i++) {
            if(accounts[i].getName().equals(name)){
                return accounts[i];
            }
        }

        return null;
    }


    private void addNewFreeSpaceIfNeeded() {
        if(free >= accounts.length){
            int newSize = accounts.length * 2;
            BankAccount[] newSpaces = new BankAccount[newSize];
            for (int i = 0; i < accounts.length; i++) {
                newSpaces[i] = accounts[i];
            }
            accounts = newSpaces;
        }

    }

}
