package day21_Arrays_Utility_For_Each_Loop;

import java.util.Arrays;
import java.util.Scanner;

public class Two_Pairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the numbers of array elements.");
        int lengthOfArray = input.nextInt();
        int[] array = new int[lengthOfArray] ;
        System.out.println("Please enter specified number");
        int specifiedNumber = input.nextInt();

        for (int i = 0; i < lengthOfArray; i++) {
            System.out.println("Please enter " + (i+1) + ". elements of array.");
            array[i]= input.nextInt();
        }
        System.out.println(Arrays.toString(array));
        String result = "";
        for (int i : array) {
            for (int i1 : array) {
                if((i+i1)==specifiedNumber && !(result.contains(""+i) || result.contains(""+i1))){
                    result += "" + i + i1 ;
                System.out.println(i + " + " + i1 + " = " + specifiedNumber);}
            }
        }

    }
}
