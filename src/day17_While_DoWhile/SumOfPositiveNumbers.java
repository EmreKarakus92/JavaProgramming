package day17_While_DoWhile;

import java.util.Scanner;

public class SumOfPositiveNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        int sum = 0 ;

        for(int i = 0 ; i<10 ; i--) {
            System.out.println("Please enter a number");
            int number = input.nextInt();
            if(number<0) break;
            sum += number ;

        }
        System.out.println("Sum of the positive numbers: " + sum);



    }
}
