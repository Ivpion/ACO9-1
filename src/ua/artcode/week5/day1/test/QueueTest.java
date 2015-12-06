package ua.artcode.week5.day1.test;

import ua.artcode.algo.rec.IQueue;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by serhii on 05.12.15.
 */
public class QueueTest {

    private IQueue queue;
    private List<TestResult> testResults;

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


    public void runAllTest(){
        testEnqueue();
        testDequeue();
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
