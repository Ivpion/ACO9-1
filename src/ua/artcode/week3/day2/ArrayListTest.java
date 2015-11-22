package ua.artcode.week3.day2;

import java.util.ArrayList;

/**
 * Created by serhii on 22.11.15.
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>(); // since java 5
        ArrayList<String> al2 = new ArrayList<>(); // since java 7

        al.add("234");
        al.add("333");
        al.add("555");

        al.size();

        al.get(0);

        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }

    }
}
