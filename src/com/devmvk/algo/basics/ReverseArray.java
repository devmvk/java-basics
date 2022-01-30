package com.devmvk.algo.basics;

public class ReverseArray {

    /*
    * Reverse {array} with size n
    *
    * Algo approach
    * when n is even/odd iterate (n/2 - 1) times and swap array[i] with array[n - i - 1]
    *
    * */
    public static int[] reverse(int[] array){
        int temp;
        int arraySize = array.length;
        for (int i = 0; i <= (arraySize / 2) - 1; i++) {
            temp = array[i];
            array[i] = array[arraySize - i - 1];
            array[arraySize - i - 1] = temp;
        }
        return array;
    }
}
