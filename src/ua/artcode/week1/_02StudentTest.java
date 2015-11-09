package ua.artcode.week1;


public class _02StudentTest {

    // numer, phone, name, age
    public static void main(String[] args) {

        int size = 10;
        int[] nums = new int[size];
        String[] phones = new String[size];
        String[] names = new String[size];
        int[] ages = new int[size];

        Student s1 = new Student();
        s1.phone = "044 233 34 34";
        s1.name = "Serhii";
        s1.age = 25;

        Student s2 = new Student();
        s2.init("Oleg", 25, "+380933332312", 5);

        Student[] group = new Student[size];

        group[0] = s1;

        s2 = null;

        s1 = null;

    }
}
