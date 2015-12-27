package ua.artcode.algo.data_structure.hash;

import ua.artcode.algo.data_structure.common.MyMap;

/**
 * Created by serhii on 27.12.15.
 */
public class MyHashtable<K, V> implements MyMap<K, V> {


    public static final int DEFAULT_TABLE_SIZE = 16;

    private Bucket<K, V>[] table;

    private final double loadFactor = 0.75;

    private int size;

    public MyHashtable() {
        table = (Bucket<K, V>[]) new Bucket[DEFAULT_TABLE_SIZE];
    }

    @Override
    public V put(K key, V value) {
        ensureCapacity();
        // get hash , find bucket
        int hash = Math.abs(key.hashCode()); // override hashCode for your own keys types
        int bucketIndex = hash % table.length;

        if (table[bucketIndex] == null) { // free bucket situation
            table[bucketIndex] = new Bucket<>(key, value, null);
        } else { // collision
            Bucket<K, V> iter = table[bucketIndex];

            while (iter.next != null) {

                iter = iter.next;

                if (iter.key.equals(key)) {
                    V old = iter.value;
                    iter.value = value; // replace value,
                    return old;
                }
            }

            iter.next = new Bucket<>(key, value, null);
        }

        this.size++;
        return null;
    }

    private void ensureCapacity() {
        // check size and load factor, do rehashing
    }

    @Override
    public V get(K key) {

        int hash = Math.abs(key.hashCode()); // override hashCode for your own keys types
        int bucketIndex = hash % table.length;

        Bucket<K, V> found = findBucket(bucketIndex, key);

        return found != null ? found.value : null;
    }

    private Bucket<K, V> findBucket(int bucketIndex, K key) {
        if (table[bucketIndex] != null) { // free bucket situation
            Bucket<K, V> iter = table[bucketIndex];

            while (iter != null) {
                if (iter.key.equals(key)) {
                    // replace value,
                    return iter;
                }
                iter = iter.next;
            }
        }

        return null;
    }

    @Override
    public boolean containsKey(K key) {

        int hash = key.hashCode(); // override hashCode for your own keys types
        int bucketIndex = hash % table.length;

        Bucket<K, V> found = findBucket(bucketIndex, key);

        return found != null;
    }

    // we need iterator((((
    @Override
    public boolean containsValue(V value) {
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    private static class Bucket<K, V> {

        K key;
        V value;
        Bucket<K, V> next;

        public Bucket(K key, V value, Bucket<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
}
