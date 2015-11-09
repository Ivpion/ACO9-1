package ua.artcode.week1;

import java.util.Arrays;

public class ArrayHelper {


    // problems, where will be min and max, not informative
    public static MinMaxContainer getMinMax(int[] mas){
        // functional programming part
        int min = Arrays.stream(mas).min().getAsInt();
        int max = Arrays.stream(mas).max().getAsInt();

        MinMaxContainer minMaxContainer = new MinMaxContainer();
        minMaxContainer.max = max;
        minMaxContainer.min = min;

        return minMaxContainer;
    }
}
