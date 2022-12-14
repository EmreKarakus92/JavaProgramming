package general_exercises;

import java.util.Scanner;

public class Febunacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the last number for febunnaci sequence");
        int lastNumber = input.nextInt();
        int firstNumber = 0 ;
        int secondNumber = 1 ;
        int sum = 0 ;

        for(int i = 1 ; i<=lastNumber ; i++){

            sum = firstNumber + secondNumber ;
            firstNumber = secondNumber ;
            secondNumber = sum ;

            if (sum>lastNumber) break ;
            System.out.print(sum + " ");

        }


    }
}
