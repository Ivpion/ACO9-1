package ua.artcode.week1;

/**
 * Created by serhii on 08.11.15.
 */
public class Student {

    String name;
    int age;
    String phone;
    int rank;

    // future constructor
    public void init(String name, int age, String phone, int rank){
        Student me = this;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.rank = rank;
    }

    public static void showTemplateName(){
        System.out.println("Student class");
    }

    public String asString(){
        return "name = " + name + ",age = " + age + ",phone = "
                + phone + ",rank = " + rank;
    }

}
