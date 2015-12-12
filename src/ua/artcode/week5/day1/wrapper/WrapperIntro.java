package ua.artcode.week5.day1.wrapper;

import ua.artcode.algo.data_structure.IQueue;
import ua.artcode.algo.data_structure.LinkedQueue;

/**
 * Created by serhii on 05.12.15.
 */
public class WrapperIntro {


    public static void main(String[] args) {

        //  Reference -> int

        Integer i1 = new Integer(23);
        Integer i2 = new Integer(25);

        int value = i1.intValue();

        Object o1 = i1;
        Object o2 = i2;

        // Autoboxing - primitive to Wrapper
        Integer wrap = 266;
        // Integer wrap = new Integer(266);

        // Unboxing  - Wrapper to primitive
        int val = i1 / wrap;
        //int val = i1.intValue() / wrap.intValue();
        Integer value2 = val;


        // Byte, Short, Integer, Long, Float, Double, Boolean, Character
        // contains useful static methods

        System.out.println(Integer.decode("0xFFFF"));
        System.out.println(Integer.compare(23, 43));
        System.out.println(Integer.valueOf(23));
        System.out.println(Integer.valueOf("23"));
        System.out.println(Integer.parseInt("99"));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.toBinaryString(234234));

        System.out.println(value2);


        IQueue<Integer> iQueue = new LinkedQueue<>();
        iQueue.enqueue(23);
    }
}
