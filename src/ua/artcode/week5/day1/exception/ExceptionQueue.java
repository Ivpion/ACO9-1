package ua.artcode.week5.day1.exception;

import ua.artcode.algo.data_structure.IQueue;
import ua.artcode.algo.data_structure.LinkedQueue;

/**
 * Created by serhii on 05.12.15.
 */
public class ExceptionQueue {


    public static void main(String[] args) {
        IQueue<Double> iQueue = new LinkedQueue<>();
        System.out.println("before");
        iQueue.dequeue();
        System.out.println("1");
        iQueue.dequeue();
        System.out.println("2");
        iQueue.dequeue();
        System.out.println("3");
        iQueue.dequeue();

        System.out.println("See");
    }
}
