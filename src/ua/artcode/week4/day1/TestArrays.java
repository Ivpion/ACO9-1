package ua.artcode.week4.day1;

import java.util.Arrays;
import java.util.List;

/**
 * Created by serhii on 28.11.15.
 */
public class TestArrays {


    public static void main(String[] args) {
//        Arrays.binarySearch() - ?
        List list = Arrays.asList(23,23,45,56,7);

        int[] original = {111,32,48,58, 1000};
        int[] newMas = Arrays.copyOf(original, 5);

        System.out.println(Arrays.toString(newMas));

        int[] rangeCopy = Arrays.copyOfRange(original, 1, 3);

        System.out.println(Arrays.toString(rangeCopy));

        Arrays.sort(original);

        Arrays.equals(original, rangeCopy);

    }
}
