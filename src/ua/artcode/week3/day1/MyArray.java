package ua.artcode.week3.day1;

/**
 * Created by serhii on 21.11.15.
 */
public class MyArray {

    // abstraction
    private Object[] mas;
    private int count;


    public MyArray(){
        mas = new Object[10];
    }

    public int indexOf(Object obj){
        for (int i = 0; i < count; i++) {
            if(mas[i].equals(obj)){ //polymorphism
                return i;
            }
        }
        return -1;
    }


}
