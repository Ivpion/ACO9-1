package ua.artcode.week3.day2;

import ua.artcode.utils.ArrayUtils;
import ua.artcode.utils.MyString;

/**
 * Created by serhii on 22.11.15.
 */
public class ComparableTest {


    public static void main(String[] args) {


        MyString[] mas = {new MyString("S"),
                            new MyString("Text"),
                            new MyString("Fullname"),
                            new MyString("Passwo")};


        Comparable min = ArrayUtils.findMin(mas);

        System.out.println(min);
    }




}
