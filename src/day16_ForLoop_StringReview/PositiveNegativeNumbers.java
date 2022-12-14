package day16_ForLoop_StringReview;

import java.util.Scanner;

public class PositiveNegativeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("How many numbers will you enter");
        int forIteration = input.nextInt();
        int positiveNumbers = 0 ;
        int negativeNumbers = 0 ;

        for (int i = 1 ; i<= forIteration ; i++) {
            System.out.println("Please enter the " + i + ". number");
            int number = input.nextInt();
            if(number>0) positiveNumbers++ ;
            if(number<0) negativeNumbers++ ;

        }
        System.out.println("positiveNumbers = " + positiveNumbers);
        System.out.println("negativeNumbers = " + negativeNumbers);



    }
}
