package day24_Return_Method;

import java.util.Arrays;
import java.util.Scanner;

public class FrequencyInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Please enter number elements of Array");
        int lengthOfArray = input.nextInt();
        
        int[] array = new int[lengthOfArray] ;
        int order = 1 ;
        for (int i =0 ; i<lengthOfArray ; i++) {
            System.out.println("Please enter the " + order + ". number");
            array[i] = input.nextInt();
            order++;
        }
        System.out.println(Arrays.toString(array));

        System.out.println("Please enter the number you want learn its frequency");
        int number= input.nextInt();
        int frequencyResult = frequency(array, number) ;
        System.out.println("frequencyResult = " + frequencyResult);
        
    }
    
    public static int frequency(int[] arrayArg, int numberArg ){
        int count = 0 ;
        for (int each : arrayArg) {
            if(each==numberArg) count++;
        }
        return count;
    }
}
