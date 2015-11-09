package ua.artcode.week1;

/**
 * Created by serhii on 08.11.15.
 */
public class TestGroup {


    public static void main(String[] args) {
        Group group = new Group();
        group.createPlaces(10);

        Student s1 = new Student();
        s1.init("Kolia",23,"ph",4);
        Student s2 = new Student();
        s2.init("Vasia",25,"ph",5);

        group.addStudent(s1);
        group.addStudent(s2);

        group.showAll();

    }
}
