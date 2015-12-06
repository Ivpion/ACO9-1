package ua.artcode.week5.day1.generics;

import ua.artcode.week2.bank.Employee;
import ua.artcode.algo.data_structure.LinkedQueue;

import java.util.ArrayList;

/**
 * Created by serhii on 05.12.15.
 */
public class IntroGenerics {

    public static void main(String[] args) {

        //
        LinkedQueue linkedQueue = new LinkedQueue();

        linkedQueue.enqueue("vova");
        linkedQueue.enqueue(23);
        linkedQueue.enqueue(23.34);
        linkedQueue.enqueue(new LinkedQueue());
        linkedQueue.enqueue(new Employee());

        Object name = linkedQueue.dequeue();
        String strName = (String) name;


        // ClassCastException
        //LinkedQueue linkedQueue1 = (LinkedQueue) linkedQueue.dequeue();


        System.out.println("next valid code");

        ArrayList al = new ArrayList();
        al.add("dsdf");
        al.add(33);
        al.add("sdfs");

        ArrayList<String> alG = new ArrayList<String>();

        //ArrayList<String> alGJava7 = new ArrayList<>();

        alG.add("Some");
        // alG.add(3);

    }

}
