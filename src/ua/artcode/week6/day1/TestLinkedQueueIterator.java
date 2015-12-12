package ua.artcode.week6.day1;

import ua.artcode.algo.data_structure.LinkedQueue;
import ua.artcode.week5.day1.test.QueueTest;

/**
 * Created by serhii on 12.12.15.
 */
public class TestLinkedQueueIterator {

    public static void main(String[] args) {
        QueueTest queueTest = new QueueTest(new LinkedQueue<>());
        queueTest.runAllTest();
        System.out.println(queueTest.toString());
    }
}
