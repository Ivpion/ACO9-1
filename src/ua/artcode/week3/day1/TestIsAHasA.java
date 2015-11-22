package ua.artcode.week3.day1;

/**
 * Created by serhii on 21.11.15.
 */
public class TestIsAHasA {


    public static void main(String[] args) {
        passParent(new Child());
    }

    public static void passParent(Parent p){

    }

}



class Parent {

}

class Child extends Parent {

    Parent parent;


}
