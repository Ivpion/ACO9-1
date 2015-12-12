package ua.artcode.week5.day1.test;

import ua.artcode.algo.data_structure.IQueue;
import ua.artcode.algo.data_structure.LinkedQueue;

/**
 * Created by serhii on 05.12.15.
 */
public class RunQueueTest {

    public static void main(String[] args) {
        IQueue queue = new LinkedQueue();

        QueueTest test = new QueueTest(queue);
        test.runAllTest();
        System.out.println(test.toString());
    }
}
