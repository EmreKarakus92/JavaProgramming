package day14_StringClass;

import java.util.Scanner;

public class SameLetter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Please enter your first number");
        String firstNumber = input.next();
        System.out.println("Please enter your second number");
        String secondNumber = input.next();

        char lastCharOfFirst = firstNumber.charAt(firstNumber.length()-1) ;
        char firstCharOfSecond = secondNumber.charAt(0) ;

        if (lastCharOfFirst == firstCharOfSecond) {
            System.out.println(firstNumber + secondNumber.substring(1));
        } else System.out.println(firstNumber + " " + secondNumber);







    }
}
