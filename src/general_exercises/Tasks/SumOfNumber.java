package general_exercises.Tasks;

import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Please enter the number");
        long number = input.nextInt();
        String num = "" + number ;
        int lengthOfNum = num.length();
        int sum = 0 ;

        for (int i = 1 ; i<=lengthOfNum ; i++ ) {
            sum += number%10 ;
            number = number/10 ;

        }
        System.out.println(sum);
    }
}
