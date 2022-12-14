package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReversedArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Please insert numbers of elements in the array.");
        int lengthOfArray = input.nextInt();
        int[] array = new int[lengthOfArray] ;

        for (int i = 0; i < lengthOfArray; i++) {
            System.out.println("Please insert " + (i+1) + ". number.");
            array[i] = input.nextInt();

        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);

        int[] reversedArray = new int[lengthOfArray] ;
        int indexReversedArray = 0 ;
        for (int i = lengthOfArray -1 ; i > -1 ; i--) {
            reversedArray[indexReversedArray] = array[i] ;
            indexReversedArray++ ;

        }

        System.out.println(Arrays.toString(reversedArray));


    }
}
