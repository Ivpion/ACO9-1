package ua.artcode.week2.day1;

public class BankAccount {

    private String name;
    private double cash;
    private String pass; // package-private

    // name const = name class
    // const without arg - DEFAULT
    public BankAccount(String name, double cash, String pass) { // return reference to @this instance
        this.name = name;
        this.cash = cash;
        this.pass = pass;
    }

    public BankAccount(String name, double cash){
        this.name = name;
        this.cash = cash;
        this.pass = "1234";
    }

    public void put(double amount){
        cash += amount;
    }

    public double withdraw(double amount){
        if(cash >= amount){
            cash -= amount;
            return amount;
        } else {
            System.out.println("Dont have enough money");
            return 0;
        }
    }

    public String getInfo(String pass) {

        if (checkPass(pass)) {
            return String.format("BA = {name: %s, cash %.2f}", name, cash);
        }

        return "pass is wrong";

    }

    public boolean checkPass(String pass) {
        return this.pass.equals(pass);
    }

    public String getInfo(){
        return "name = " + name;
    }

    // mutattor -> method than change some private field
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void changePass(String oldPass, String newPass){
        if(checkPass(oldPass)){
            this.pass = newPass;
        } else {
            System.err.println("Wrong oldPass");
        }
    }


}
