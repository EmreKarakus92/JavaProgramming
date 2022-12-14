package day24_Return_Method;

import java.util.Arrays;

public class ReversedArray {
    public static void main(String[] args) {
        int[] arr = {15, 56, 98, 73} ;
        int[] resultArr = reversedArray(arr);
        System.out.println(Arrays.toString(resultArr));

    }
    public static int[] reversedArray(int[] arrayArg){
       int[] reversedArr = new int[arrayArg.length] ;
        System.out.println(arrayArg.length);
       int count = 0 ;
        for (int i = (arrayArg.length-1) ; i >= 0 ; i--) {
            reversedArr[count] = arrayArg[i] ;
            count += 1 ;

        }
            return reversedArr;


    }
}

