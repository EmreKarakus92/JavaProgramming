package day13_StringClass;

import java.util.Scanner;

public class InitialsOfLetter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Please Enter the First Letter");
        String firstLetter = input.next() ;
        System.out.println("Please Enter the Second Letter");
        String secondLetter = input.next() ;

        char firstLetterChar = firstLetter.charAt(0) ;
        char secondLetterChar = secondLetter.charAt(0) ;

        System.out.println( firstLetterChar + "." + secondLetterChar);

    }
}
