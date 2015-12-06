package ua.artcode.week5.day1.wrapper;

import ua.artcode.utils.TimeAction;
import ua.artcode.utils.TimeCounter;

/**
 * Created by serhii on 05.12.15.
 */
public class TestWrapperSpeed {


    public static void main(String[] args) {

        TimeAction wrapperSumTest = new TimeAction(){
            @Override
            public void callWrappedAction() {
                Integer res = 0;
                for (int i = 0; i < 10_000_000; i++) {
                    res += i;
                }
            }
        };

        TimeAction primitiveSumTest = new TimeAction(){
            @Override
            public void callWrappedAction() {
                int res = 0;
                for (int i = 0; i < 10_000_000; i++) {
                    res += i;
                }
            }
        };

        System.out.println(TimeCounter.countActionTime(wrapperSumTest));
        System.out.println(TimeCounter.countActionTime(primitiveSumTest));
    }
}
