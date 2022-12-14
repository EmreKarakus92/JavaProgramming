package day13_StringClass;

import java.util.Scanner;

public class StringCharLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your word.");
        String letter = input.nextLine();
        int lengthOfLetter = letter.length();
        //System.out.println("lengthOfLetter = " + lengthOfLetter);
        if (lengthOfLetter > 0) {
            if (lengthOfLetter <= 3) {
                System.out.println(letter);
            } else {
                System.out.print(letter.charAt(lengthOfLetter - 3));
                System.out.print(letter.charAt(lengthOfLetter - 2));
                System.out.print(letter.charAt(lengthOfLetter - 1));
            }

        }  else System.out.println("Empty");



    }
}
