package ua.artcode.week5.day1.generics;

import ua.artcode.algo.data_structure.IQueue;
import ua.artcode.algo.data_structure.LinkedQueue;

/**
 * Created by serhii on 05.12.15.
 */
public class ExampleGenericsValid {

    public static void main(String[] args) {

        //
        IQueue<String> linkedQueue = new LinkedQueue<>();

        linkedQueue.enqueue("sdfsdf");
        linkedQueue.enqueue("234235");

        String first = linkedQueue.dequeue();
        String second = linkedQueue.dequeue();

    }

}
