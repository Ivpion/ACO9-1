package ua.artcode.week4.day1;

/**
 * Created by serhii on 28.11.15.
 */
public class TestEntry {

    public static void main(String[] args) {
        MyKey myKey = new MyKey('c','a','b');

        Entry entry = new Entry(myKey, "Hello world");

        Object value = entry.getValue(myKey);
        System.out.println(value);

        testKey(myKey);

        System.out.println(entry.getValue(myKey));

    }

    public static void testKey(MyKey key){

    }

}
