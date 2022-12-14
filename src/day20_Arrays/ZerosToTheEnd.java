package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ZerosToTheEnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Please enter number of elements in the array");
        int lengthOfArray = input.nextInt();

        int[] array = new int[lengthOfArray] ;

        for(int i = 0 ; i<lengthOfArray ; i++) {
            System.out.println("Please enter " + (i+1) + ". number.");
            array[i]= input.nextInt();
        }

        int[] newArray = new int[lengthOfArray] ;
        int newI = 0 ;
        int zero = 1 ;
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
           if(!(array[i]==0)){
               newArray[newI] = array[i] ;
               newI++;
           } else {
               newArray[lengthOfArray-zero] = array[i] ;
               zero++ ;
           }


        }
        System.out.println(Arrays.toString(newArray));

    }
}
