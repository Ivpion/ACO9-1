package ua.artcode.utils;

/**
 * Created by serhii on 22.11.15.
 */
public class TimeCounter {


    public static long countActionTime(TimeAction timeAction){

        long start = System.currentTimeMillis();
        timeAction.callWrappedAction();
        long end = System.currentTimeMillis();

        return end - start;
    }


}
