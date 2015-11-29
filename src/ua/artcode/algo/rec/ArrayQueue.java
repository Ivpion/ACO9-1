package ua.artcode.algo.rec;

/**
 * Created by serhii on 29.11.15.
 */
public class ArrayQueue implements IQueue {

    private static final int DEFAULT_ARRAY_SIZE = 10;

    private int head;
    private int tail;
    private Object[] mas;
    private int size;

    public ArrayQueue() {
        mas = new Object[DEFAULT_ARRAY_SIZE];
    }

    public ArrayQueue(int size) {
        mas = new Object[size];
    }

    @Override
    public void enqueue(Object node) {

        if(tail == mas.length){
            System.err.println("queue is full");
            return;
        }

        mas[tail] = node;
        tail++;
        size++;
    }

    @Override
    public Object dequeue() {
        if(size == 0){
            System.err.println("Queue is empty");
            return null;
        }


        Object headObj = mas[head];
        head++;
        size--;
        return headObj;
    }

    @Override
    public int size() {
        return size;
    }
}
