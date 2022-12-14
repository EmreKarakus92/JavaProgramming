package day21_Arrays_Utility_For_Each_Loop;

import java.util.Arrays;
import java.util.Scanner;

public class Count_Even_Odd_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Please enter the numbers of elements the array");
        int lengthOfArray = input.nextInt();

        int[] array = new int[lengthOfArray] ;

        for(int i = 0 ; i<lengthOfArray ; i++) {
            System.out.println("Please enter " + (i+1) + ".number");
            array[i] = input.nextInt() ;
        }

        System.out.println(Arrays.toString(array));

        String resultEven = "" , resultOdd = "" ;

        for (int i : array) {
            if( i % 2 == 0 ) resultEven += i + " " ;
            else resultOdd += i + " " ;
        }

        System.out.println("resultEven = " + resultEven);
        System.out.println("resultOdd = " + resultOdd);

    }
}
