package general_exercises.Tasks;

import java.util.Scanner;

public class SumThirdNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Please enter the number between 100-999");
        int number = input.nextInt();

        int firstNumber = number / 100 ;
        int secondNumber = (number % 100) / 10 ;
        int thirdNumber = (number % 100) % 10 ;
        int sum = firstNumber + secondNumber + thirdNumber ;
        System.out.println( sum );


    }
}
