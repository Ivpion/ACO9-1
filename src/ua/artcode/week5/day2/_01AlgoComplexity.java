package ua.artcode.week5.day2;

import ua.artcode.algo.common.ArrayUtils;
import ua.artcode.algo.sort.SelectionSorter;
import ua.artcode.utils.TimeAction;
import ua.artcode.utils.TimeCounter;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by serhii on 06.12.15.
 */
public class _01AlgoComplexity {


    public static void main(String[] args) {
        int[] mas = ArrayUtils.genMas(100_000, 0, 1_000);
        int[] copy = Arrays.copyOf(mas,mas.length);



        long time1 = TimeCounter.countActionTime(new TimeAction() {
            @Override
            public void callWrappedAction() {
                SelectionSorter.sort(mas);
            }
        });

        System.out.println(time1 + " SelectionSort");

        long time2 = TimeCounter.countActionTime(new TimeAction() {
            @Override
            public void callWrappedAction() {
                Arrays.sort(copy);
            }
        });
        System.out.println(time2 + " Arrays.sort ?");
    }
}
