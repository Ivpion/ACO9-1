package ua.artcode.utils;

import java.util.Comparator;

/**
 * Created by serhii on 22.11.15.
 */
public class ArrayUtils {

    public static Comparable findMin(Comparable[] mas){

        if(mas == null || mas.length == 0){
            System.out.println("input mas is null or empty");
            return null;
        }



        Comparable min = mas[0];

        for (int i = 0; i < mas.length; i++) {
            if(min.compareTo(mas[i]) > 0){
                min = mas[i];
            }
        }


        return min;


    }

    public static Object findMin(Object[] mas, Comparator comparator){

        if(mas == null || mas.length == 0){
            System.out.println("input mas is null or empty");
            return null;
        }



        Object min = mas[0];

        for (int i = 0; i < mas.length; i++) {
            if(comparator.compare(min, mas[i]) > 0){
                min = mas[i];
            }
        }


        return min;


    }
}
