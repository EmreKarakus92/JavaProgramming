package day18_NestedLoop;

import java.util.Scanner;

public class DecrementNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.println("Please enter a number");
        String number = input.next();

        int lengthOfNumber = number.length();
        String result = "";
        char ch ;
        for(char j = '9' ; j>='0' ; j--){
            for(int i = 0 ; i<lengthOfNumber ; i++){
                ch = number.charAt(i) ;
                if(ch == j) result += j ;

            }
            }

        System.out.println(result);




    }
}
