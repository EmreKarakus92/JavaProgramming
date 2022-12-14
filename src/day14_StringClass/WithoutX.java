package day14_StringClass;

import java.util.Scanner;

public class WithoutX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Please enter your word");
        String word = input.next();

        char firstChar = word.charAt(0) ;
        if ( firstChar == 'x' ) {
            word = word.substring(1) ;
        }

        System.out.println(word);


    }
}
