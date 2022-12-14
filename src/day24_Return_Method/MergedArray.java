package day24_Return_Method;

import java.util.Arrays;
import java.util.Scanner;

public class MergedArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of elements for first array");
        int lengthOfArray1 = input.nextInt();

        System.out.println("Please enter number of elements for second array");
        int lengthOfArray2 = input.nextInt();

        int[] array1 = new int[lengthOfArray1] ;
        for (int i = 0; i < lengthOfArray1; i++) {
            System.out.println("Please enter the " + (i+1) + ". element");
            array1[i] = input.nextInt();
        }

        int[] array2 = new int[lengthOfArray2] ;
        for (int i = 0; i < lengthOfArray2; i++) {
            System.out.println("Please enter the " + (i+1) + ". element");
            array2[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        String[] result = mergedArray(array1,  array2) ;
        System.out.println(Arrays.toString(result));


    }

    public static String[] mergedArray(int[] arrayArg1, int[] arrayArg2){
        String combinedResult = "";
        for(int i = 0 ; i<arrayArg1.length ; i++){
            combinedResult += arrayArg1[i] + " " ;
        }

        for (int j=0 ; j<arrayArg2.length ; j++){
            combinedResult += arrayArg2[j] + " ";
        }
        String[] combinedArray = combinedResult.split(" ") ;

        return combinedArray;
    }
}
