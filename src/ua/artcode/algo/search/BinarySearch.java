package ua.artcode.algo.search;

import java.util.Comparator;

/**
 * Created by serhii on 06.12.15.
 */
public class BinarySearch {


    public int binarySearch(Comparable[] mas, Comparable key){
        return -1;
    }

    public int binarySearch(Object[] mas, Comparator comp, Object key){
        return -1;
    }

    public<T> int binarySearchG(T[] mas, Comparator<T> comp, T key){
        return -1;
    }


    // generic wildcard 'extends', 'super'
    public<T extends Comparable> int binarySearchG(T[] mas, T key){
        return -1;
    }

}
