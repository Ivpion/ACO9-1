package ua.artcode.algo.data_structure;

/**
 * Created by serhii on 29.11.15.
 */
public interface IQueue<U> extends Iterable<U> {

    void enqueue(U node);

    U dequeue();

    int size();

//    ArrayQueue.ArrayQueueIterator createIterator();

}
