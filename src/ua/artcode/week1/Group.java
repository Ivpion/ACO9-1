package ua.artcode.week1;

/**
 * Created by serhii on 08.11.15.
 */
public class Group {

    Student[] studentPlaces;// null
    int freePlaceIndex;

    public void createPlaces(int size) {
        studentPlaces = new Student[size];
    }

    public void addStudent(Student newStudent) {
        if (studentPlaces == null) {
            System.err.println("can not add, create places first");
        } else {
            if (freePlaceIndex >= studentPlaces.length) {
                System.err.println("Full gruop, wait for next");
            } else {
                studentPlaces[freePlaceIndex] = newStudent;
                freePlaceIndex++;
            }
        }

    }

    public void showAll() {
        for (int i = 0; i < freePlaceIndex; i++) {
            System.out.println(studentPlaces[i].asString());
        }
    }

}
