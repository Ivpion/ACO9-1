package ua.artcode.algo.data_structure.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ua.artcode.algo.data_structure.common.MyMap;
import ua.artcode.algo.data_structure.hash.MyHashtable;
import ua.artcode.algo.data_structure.tree.MyBST;

import java.util.Comparator;

/**
 * Created by serhii on 27.12.15.
 */
public class MyMapTest {

    private MyMap<String,Integer> map;

    @Before
    public void setUp(){/*
        map = new MyBST<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });*/

        //map = new MyBST<>(String::compareTo);
        map = new MyHashtable<>();
    }

    @Test
    public void testPut(){
        map.put("Vania", 22);
        map.put("Serhii", 23);
        map.put("Oleg", 25);
        Assert.assertEquals( 3,map.size());
    }


    @Test
     public void testGet(){
        map.put("Vania", 22);
        Assert.assertEquals(new Integer(22),map.get("Vania"));
    }

    @Test
    public void testContainsKey(){
        map.put("Vania", 22);
        Assert.assertTrue(map.containsKey("Vania"));
    }

}
