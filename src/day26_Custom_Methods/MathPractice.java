package day26_Custom_Methods;

import utilities.MathUtilities;

public class MathPractice {
    public static void main(String[] args) {
        int num1 = 2 ;
        int num2 = 5 ;

        System.out.println(MathUtilities.minNumberBetweenTwoNumbers(num1,num2) + "minNumber");
        System.out.println(MathUtilities.maxNumberBetweenTwoNumbers(num1,num2) + "maxNumber");
        System.out.println(MathUtilities.isOddNumber(num1) + "oddNumber");
        System.out.println(MathUtilities.squareOfANumber(num2));
    }
}
