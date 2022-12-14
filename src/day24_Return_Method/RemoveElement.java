package day24_Return_Method;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        int[] array = {55, 88, 56, 15} ;
        int indexOfNumber = 2 ;

        int[] resultArray = removeElement(array, indexOfNumber);
        System.out.println(Arrays.toString(resultArray));

    }
    public static int[] removeElement(int[] arrayArg, int indexArg){
        int[] newArray = new int[arrayArg.length-1] ;
        int count = 0 ;
        for (int i = 0; i < arrayArg.length; i++) {
            if(!(i==indexArg)){
                newArray[count] = arrayArg[i] ;
                count++ ;
            }
        }
        return newArray ;
    }

}
