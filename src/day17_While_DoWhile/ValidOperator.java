package day17_While_DoWhile;

import java.util.Scanner;

public class ValidOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int firstNumber = input.nextInt();

        System.out.println("Please enter the second number");
        int secondNumber = input.nextInt();

        int result = 0;

        System.out.println("Please enter the operator");
        char operator = input.next().charAt(0);

        while ( !(operator== '+' || operator== '-' || operator== '*' || operator== '/') ){
            System.out.println("Please enter valid operator");
            operator = input.next().charAt(0);
        }

        switch (operator){

            case '+' : result = firstNumber + secondNumber ; break ;
            case '-' : result = firstNumber - secondNumber ; break ;
            case '*' : result = firstNumber * secondNumber ; break ;
            case '/' : result = firstNumber / secondNumber ; break ;

        }

        System.out.println(result);


    }
}
