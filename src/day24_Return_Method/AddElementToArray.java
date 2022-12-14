package day24_Return_Method;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Please enter number of elements");
        int lengthOfArray = input.nextInt();

        int[] array = new int[lengthOfArray] ;
        for (int i = 0; i < lengthOfArray; i++) {
            System.out.println("Please enter the " + (i+1) + ". element");
            array[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(array));

        System.out.println("Please enter the element which will be added to array.");
        int element = input.nextInt();

        int[] addedArray = addElement(array, element);
        System.out.println(Arrays.toString(addedArray));

    }

    public static int[] addElement(int[] arrayArg, int elementArg){
        int[] resultArray = new int[arrayArg.length+1] ;
        for(int i = 0 ; i<arrayArg.length ; i++){
            resultArray[i] = arrayArg[i];
        }
        resultArray[arrayArg.length] = elementArg ;
        return resultArray;
    }
}
