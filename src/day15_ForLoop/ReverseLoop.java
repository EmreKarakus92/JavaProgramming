package day15_ForLoop;

import java.util.Scanner;

public class ReverseLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Please enter your words.");
        String word = input.nextLine();
        int lengthOfWord = word.length();
        for (int i = lengthOfWord-1 ; i>=0 ; i-- ) {
            System.out.print(word.charAt(i));
        }





    }
}
