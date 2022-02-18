package com.DSALGO;
import java.util.HashMap;
import java.util.Map;

public class Maps {
//    ==> Map contains values on the basis of key, i.e. key and value pair
//    EAch key and value pair is known as entry
//    Map contains unique value
    public static void main(String[] args) {
        Map m= new HashMap();
//        -> put() is used to insert entery in map
        m.put(1,"Rahul");
        m.put(2,"Gaurav");
        m.put(3,"Dnyaneshwar");
        m.put(4,"Mayur");
        System.out.println("Map-1" + m);
//        -> remove() is used to remove entry from map
        m.remove(2);
        System.out.println("Map-2" + m);
//        -> keySet() is returns the Set view containing all the keys
        System.out.println(m.keySet());
//        -> size() is return size of map
        System.out.println(m.size());
//        -> containsValue() is used to compare existing value in map
        if(m.containsKey(1) && m.containsValue("Rahul")) {
            System.out.println("True");
        }
//        -> equals() is used to compare object with map
        if(m.equals("Mayur") == true){
            System.out.println("True");
        }
//        -> get() is used to get value from map
        System.out.println(m.get(1));
//        -> clear() is used to clear map
        m.clear();
//        -> isEmpty() is return true map is empty
        if(m.isEmpty()) {
            System.out.println("Empty");
        }


    }
}
