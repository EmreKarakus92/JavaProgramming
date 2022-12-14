package day24_Return_Method;

import java.util.Scanner;

public class ContainsNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("number of element");
        int lengthOfArray = input.nextInt();

        int[] array = new int[lengthOfArray] ;
        for (int i = 0; i < lengthOfArray; i++) {
            System.out.println("enter a number");
            array[i] = input.nextInt();
        }

        System.out.println("the number");
        int number = input.nextInt();

        boolean result = containNumber(array, number) ;
        System.out.println("result = " + result);

    }
    public static boolean containNumber(int[] arrayArg, int numberArg){
        boolean resultArg = false ;
        for (int each : arrayArg) {
            if(each == numberArg) resultArg = true ;
        }
        return resultArg;
    }
}
