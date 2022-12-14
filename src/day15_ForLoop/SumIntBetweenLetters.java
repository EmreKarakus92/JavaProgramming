package day15_ForLoop;

import java.util.Scanner;

public class SumIntBetweenLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert  a statement");
        String statement = input.next();
        int length = statement.length();
        int sum = 0 ; char num ;
        for(int i = 0 ; i<length ; i++) {
            num = statement.charAt(i);
            if(num >= '0' && num <= '9'){
                sum += num-48 ;

            }
        }
        System.out.println(sum);
    }
}
