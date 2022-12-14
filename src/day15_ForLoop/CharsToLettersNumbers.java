package day15_ForLoop;

import java.util.Scanner;

public class CharsToLettersNumbers {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter a string");
        String word = input.next();
        int lengthOfWork = word.length();
        char temp1 ;
        String str = "";
        String letter = "", digit = "", specialChar= "" ;
        for(int i = 0 ; i<lengthOfWork ; i++) {
            temp1 = word.charAt(i);
            str = "" + temp1 ;
            if((temp1>='A' && temp1<='Z') || (temp1>='a' && temp1<='z') ){
                letter = letter + str ;
            } else if (temp1>='0'&& temp1<='9') {
                digit = digit + str ;
            } else specialChar = specialChar + str ;
        }
        System.out.println(letter);
        System.out.println(digit);
        System.out.println(specialChar);
        System.out.println("heyy");



    }
}
