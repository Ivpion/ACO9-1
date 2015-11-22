package ua.artcode.week3.day2;

/**
 * Created by serhii on 22.11.15.
 */
public class InterfacesTest {

    public static void main(String[] args) {
        University university = new University();
        Company company = new Company();


        IStudent iStudent = new Student();
        iStudent.study();

        Student student = new Student();

        Worker worker = new Worker();


        university.passExam(student);
        company.startWorkDay(worker);

        SuperPerson superPerson = new SuperPerson();
        university.passExam(superPerson);
        company.startWorkDay(superPerson);


    }
}


// describe student behavior by abstract methods
interface IStudent { // for is - a

    public abstract void study();


}

interface IWorker {

    void work();

}

class Student implements IStudent { // is - a


    public void study(){
        System.out.println("Student study");
    }

}

class Worker implements IWorker {

    public void work(){
        System.out.println("Worker work");
    }

}

class SuperPerson implements IStudent, IWorker {


    @Override
    public void study() {
        System.out.println("SuperPerson study");
    }

    @Override
    public void work() {
        System.out.println("SuperPerson work");
    }
}

class University {


    public void passExam(IStudent student){
        student.study();
    }

}

class Company {


    public void startWorkDay(IWorker worker){
        worker.work();
    }

}
