package com.devmvk.algo.basics;

public class BasicSort {

    /*
    *
    *
    * */

    public static void sortArray(int[] array){
        for (int i=0; i< array.length - 1; i++){
            for (int j=i+1; j < array.length; j++){
                int maxValue = array[i];
                if(maxValue < array[j]){
                    maxValue = array[j];
                    array[j] = array[i];
                    array[i] = maxValue;
                }
            }
        }
    }
}
