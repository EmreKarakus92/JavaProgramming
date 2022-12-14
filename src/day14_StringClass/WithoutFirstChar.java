package day14_StringClass;

import java.util.Scanner;

public class WithoutFirstChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Please enter your first word.");
        String firstWord = input.next();
        System.out.println("Please enter your second word.");
        String secondWord = input.next();

        System.out.println(firstWord.substring(1) + secondWord.substring(1));




    }

}
