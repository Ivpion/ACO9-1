package ua.artcode.week8.day1;

import ua.artcode.utils.TimeAction;
import ua.artcode.utils.TimeCounter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by serhii on 26.12.15.
 */
public class TestArrayListLinkedList {

    public static void main(String[] args) {

        final List<String> al = new ArrayList<>(10_000_000);
        final List<String> ll = new LinkedList<>();

        for (int i = 0; i < 10_000_000; i++) {
            al.add(String.valueOf(i));
            ll.add(String.valueOf(i));
        }

        long addToMidALTime = TimeCounter.countActionTime(() -> al.add(al.size() / 2, "mid"));
        long addToMidLLTime = TimeCounter.countActionTime(() -> ll.add(ll.size() / 2, "mid"));

        long addALTime = TimeCounter.countActionTime(new TimeAction() {
            @Override
            public void callWrappedAction() {
                al.add(0,"first");
            }
        });

        long addLLTime = TimeCounter.countActionTime(() -> ll.add(0,"first"));

        long addLastALTime = TimeCounter.countActionTime(() -> al.add("last"));
        long addLastLLTime = TimeCounter.countActionTime(() -> ll.add("last"));


        long findALTime = TimeCounter.countActionTime(() -> al.contains("last"));
        long findLLTime = TimeCounter.countActionTime(() -> ll.contains("last"));


        long removeFirstALTime = TimeCounter.countActionTime(() -> al.remove(0));
        long removeFirstLLTime = TimeCounter.countActionTime(() -> ll.remove(0));


        System.out.printf("addFirst %s vs %s\n" +
                "addLast %s vs %s\n" +
                "addToMid %s vs %s\n" +
                "find %s vs %s\n" +
                "removeFirst %s vs %s", addALTime,addLLTime,
                                        addLastALTime, addLastLLTime,
                                        addToMidALTime, addToMidLLTime,
                                        findALTime, findLLTime,
                                        removeFirstALTime,removeFirstLLTime);


    }


}
