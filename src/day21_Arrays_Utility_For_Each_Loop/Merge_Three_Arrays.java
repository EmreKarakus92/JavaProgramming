package day21_Arrays_Utility_For_Each_Loop;

import java.util.Arrays;

public class Merge_Three_Arrays {
    public static void main(String[] args) {

        int[] array1 = {15, 24, 46, 56} ;
        int[] array2 = {24, 56, 75, 33, 12} ;
        int[] array3 = {14, 25, 67} ;
        int[] mergedArray = new int[array1.length + array2.length + array3.length] ;

        int indexOfMergedArray = 0 ;

        for (int i : array1) {
            mergedArray[indexOfMergedArray] = i ;
            indexOfMergedArray++ ;
        }

        for (int i : array2) {
            mergedArray[indexOfMergedArray] = i ;
            indexOfMergedArray++ ;
        }
        for (int i : array3) {
            mergedArray[indexOfMergedArray] = i ;
            indexOfMergedArray++ ;
        }
        System.out.println(Arrays.toString(mergedArray));
        Arrays.sort(mergedArray);
        System.out.println(Arrays.toString(mergedArray));


    }
}
