package com.devmvk.algo.basics;

public class MinElement {

    public static int finMin(int[] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(min > array[i]){
                min = array[i];
            }
        }
        return min;
    }
}
