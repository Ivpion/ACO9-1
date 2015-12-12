package ua.artcode.week5.day1.test;

import ua.artcode.algo.data_structure.IQueue;
import ua.artcode.core_test.AbstractTest;
import ua.artcode.core_test.TestResult;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class QueueTest extends AbstractTest {

    private IQueue queue;


    public QueueTest(IQueue queue) {
        this.queue = queue;
        testResults = new ArrayList<>();
    }

    public void testEnqueue() {
        queue.enqueue("test1");
        queue.enqueue("test2");


        testResults.add(new TestResult(
                                "testEnqueue", "2",
                                String.valueOf(queue.size())));
    }

    public void testDequeue(){
        queue.dequeue();
        queue.dequeue();

        testResults.add(new TestResult(
                "testDequeue", "0",
                String.valueOf(queue.size())));
    }

    public void testSize(){
        for (int i = 0; i < 5; i++) {
            queue.enqueue(i);
        }

        int size = queue.size();

        testResults.add(new TestResult("testForEach",String.valueOf(5),String.valueOf(size)));
    }

    public void testIterator(){
        //Iterator iQueue = queue.iterator();

    }

    public void testForEach(){

        for (int i = 0; i < 5; i++) {
            queue.enqueue(i);
        }

        int size = queue.size();

        int count = 0;
        for (Object o : queue) {
            count++;
        }

        testResults.add(new TestResult("testForEach",String.valueOf(size),String.valueOf(count)));
    }


    public void runAllTest(){
        testEnqueue();
        testDequeue();
        testSize();
        testForEach();
    }

    @Override
    public String toString() {
        String res = "";
        for (TestResult testResult : testResults) {
            res += testResult + "\n";
        }
        return res;
    }
}
