package ua.artcode.week3.day2;

import ua.artcode.utils.TimeAction;
import ua.artcode.utils.TimeCounter;
import ua.artcode.week2.bank.Coder;

/**
 * Created by serhii on 22.11.15.
 */
public class TestTimeCounter {


    public static void main(String[] args) {
        long time1 = TimeCounter.countActionTime(new MyLongAccumulateAction());
        System.out.println(time1);
        long time2 = TimeCounter.countActionTime(new MyStringAccumulateAction());
        System.out.println(time2);

        System.out.println(TimeCounter.countActionTime(new Coder()));


    }
}

class MyLongAccumulateAction implements TimeAction {


    @Override
    public void callWrappedAction() {
        long res = 0;

        for (int i = 0; i < 1_000_000; i++) {
            res += i;
        }
    }
}

class MyStringAccumulateAction implements TimeAction {


    @Override
    public void callWrappedAction() {
        String res = "";

        for (int i = 0; i < 10_000; i++) {
            res += i;
        }
    }
}

