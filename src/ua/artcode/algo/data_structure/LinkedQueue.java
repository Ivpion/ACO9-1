package ua.artcode.algo.data_structure;

import ua.artcode.algo.common.Node;

import java.util.Iterator;


public class LinkedQueue<T> implements IQueue<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;


    @Override
    public void enqueue(T obj) {
        if(size() == 0){
            head = new Node<>(obj, null);
            tail = head;
        } else {
            Node<T> nNode = new Node<>(obj, null);
            tail.next = nNode;
            tail = nNode;
        }

        size++;
    }

    @Override
    public T dequeue() {

        if(size() == 0){
            throw new QueueEmptyException();
        }

        T forRet = head.value;

        head = head.next;
        size--;

        return forRet;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedQueueIterator();
    }

    private class LinkedQueueIterator implements Iterator<T>{

        private Node<T> curr = head;

        @Override
        public boolean hasNext() {
            return curr != null;
        }

        @Override
        public T next() {
            T forRet = curr.value;
            curr = curr.next;
            return forRet;
        }
    }
}
