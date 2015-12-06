package ua.artcode.algo.common;

/**
 * Created by serhii on 05.12.15.
 */
public class Node<E> {

    public E value;
    public Node<E> next;

    public Node(E value, Node<E> next) {
        this.value = value;
        this.next = next;
    }

}
