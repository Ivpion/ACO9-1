package ua.artcode.algo.data_structure;

import java.util.Iterator;

/**
 * Created by serhii on 29.11.15.
 */
public class ArrayQueue<T> implements IQueue<T> {

    private static final int DEFAULT_ARRAY_SIZE = 10;

    private int head;
    private int tail;
    private T[] mas;
    private int size;

    public ArrayQueue() {
        mas = (T[]) new Object[DEFAULT_ARRAY_SIZE];
    }

    public ArrayQueue(int size) {
        mas = (T[]) new Object[size];
    }

    @Override
    public void enqueue(T node) {

        if(tail == mas.length){
            throw new ContainerStateException("queue is full");
        }

        mas[tail] = node;
        tail++;
        size++;
    }

    @Override
    public T dequeue() {
        if(size == 0){
            throw new ContainerStateException("queue is empty");
        }


        T headObj = mas[head];
        head++;
        size--;
        return headObj;
    }

    @Override
    public int size() {
        return size;
    }


    @Override
    public Iterator<T> iterator() {
        return new ArrayQueueIterator();
    }

    // inner classes -> inner class instance depends on outer instance
    private class ArrayQueueIterator implements Iterator<T> {

        private int curr = head;

        public boolean hasNext(){
            return curr < tail;
        }

        public T next(){
            T currentObj = mas[curr];
            curr++;
            return currentObj;
        }

    }

}
