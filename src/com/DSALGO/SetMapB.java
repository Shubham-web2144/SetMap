package com.DSALGO;

import java.util.HashSet;
import java.util.Set;

public class SetMapB {

//    Problem - Union of given two arrays using set,

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int arr1[] = {1,6,5,7};
        Set<Integer> s = new HashSet<>();

        for(int i = 0; i < arr.length; i++){
            s.add(arr[i]);
        }
        for(int i = 0; i < arr1.length; i++){
            s.add(arr1[i]);
        }

//        print set
        System.out.println(s);
    }
}
