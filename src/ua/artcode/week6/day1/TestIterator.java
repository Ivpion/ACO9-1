package ua.artcode.week6.day1;

import ua.artcode.algo.data_structure.ArrayQueue;
import ua.artcode.algo.data_structure.IQueue;

import java.util.Iterator;

/**
 * Created by serhii on 12.12.15.
 */
public class TestIterator {

    public static void main(String[] args) {

        IQueue<String> arrayQueue = new ArrayQueue<>();
        arrayQueue.enqueue("Andrey");
        arrayQueue.enqueue("Ivan");
        arrayQueue.enqueue("Serhii");
        arrayQueue.enqueue("Oleg");
        arrayQueue.enqueue("Bogdan");
        arrayQueue.enqueue("Nastia");
        arrayQueue.enqueue("Tania");
        arrayQueue.enqueue("Bogdan");
        arrayQueue.enqueue("Jenia");

        Iterator<String> iterator =
                arrayQueue.iterator();

        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }

        // for each needs Iterable
        for(String value : arrayQueue){
            System.out.println(value);
        }


    }
}
