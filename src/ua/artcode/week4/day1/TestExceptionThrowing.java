package ua.artcode.week4.day1;

/**
 * Created by serhii on 28.11.15.
 */
public class TestExceptionThrowing {

    public static void main(String[] args) {
        System.out.println("before");
        a();
        System.out.println("after");
    }

    public static void a() {
        b();
    }

    public static void b() {
        c();
    }

    public static void c() {
        throwNullPointer(null);
    }


    public static void throwNullPointer(int[] mas) {
        int el = mas.length;
    }

    public static void throwClassCastEx(Object obj) {

    }


}
