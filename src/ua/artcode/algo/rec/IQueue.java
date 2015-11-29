package ua.artcode.algo.rec;

/**
 * Created by serhii on 29.11.15.
 */
public interface IQueue {

    void enqueue(Object node);

    Object dequeue();

    int size();

}
