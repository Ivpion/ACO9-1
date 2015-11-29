package ua.artcode.algo.rec;

public class MakeReportWithQueueTest {

    public static void main(String[] args) {
        Node emp1 = new Node(1);
        Node emp2 = new Node(1);
        Node emp3 = new Node(1);

        Node manager1 = new Node(10, emp1,emp2,emp3);

        Node manager2 = new Node(10, new Node(1),new Node(1),new Node(1));


        Node dir = new Node(100, manager1, manager2);



        int res = TreeOperations.makeReportViaQueue(dir, new ArrayQueue());

        System.out.println(res);
    }




}




