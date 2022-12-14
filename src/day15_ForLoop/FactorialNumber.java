package day15_ForLoop;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = input.nextInt();

        int multiply = 1 ;

        for(int i = 1; i<=num ; i++){
            multiply *= i ;
        }
        System.out.println(multiply);







    }
}
