package ua.artcode.algo.data_structure;

public interface IQueue<U> extends Iterable<U> {

    void enqueue(U node);

    U dequeue();

    int size();

//    ArrayQueue.ArrayQueueIterator createIterator();

}
