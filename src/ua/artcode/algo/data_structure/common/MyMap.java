package ua.artcode.algo.data_structure.common;

/**
 * Created by serhii on 27.12.15.
 */
public interface MyMap<K,V> {

    V put(K key, V value);

    V get(K key);

    boolean containsKey(K key);

    boolean containsValue(V value);

    int size();

}
