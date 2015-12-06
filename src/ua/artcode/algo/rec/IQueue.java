package ua.artcode.algo.rec;

/**
 * Created by serhii on 29.11.15.
 */
public interface IQueue<U> {

    void enqueue(U node);

    U dequeue();

    int size();

}
