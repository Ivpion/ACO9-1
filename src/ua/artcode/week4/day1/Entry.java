package ua.artcode.week4.day1;

/**
 * Created by serhii on 28.11.15.
 */
public class Entry {

    private Object key;
    private Object value;

    public Entry(MyKey key, Object value) {
        this.key = key.clone();
        this.value = value;
    }

    public Object getValue(Object key){
        return this.key.equals(key) ? value : null;
    }

}
