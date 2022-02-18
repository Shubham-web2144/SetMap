package com.DSALGO;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Set and Map Interface
        Set<Integer> s = new HashSet<>();

//  NOTE : In a set we can't add duplicate values
//        Set is a interface and it is implemented by three classes - LinkedHashSet, HashSet,
//        ->add() function add value in set
        s.add(2);
        s.add(3);
        s.add(4);
//        ->contains()function check value exists or not
        if(s.contains(1) == true) {
            System.out.println("Element is exists");
        }
        else {
            System.out.println("Element is not exists");
        }
//        ->size() function returns size or lenght of set
        int size = s.size();
//        ->remove() function remove elements
        s.remove(2);
//        ->isEmpty() function checks set is empty or not
        if(s.isEmpty()) {
            System.out.println("Set is empty");
        }
        else {
            System.out.println("Set is not empty");
        }
//        ->equal() function check value is equal or not

        if(s.equals(8) == true){
            System.out.println("Equal value is present");
        }
        else {
            System.out.println("Equal value is not present");
        }
//        ->clear() function clear all elements from set
        s.clear();

    }
}
