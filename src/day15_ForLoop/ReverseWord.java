package day15_ForLoop;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Sentence");
        String word = input.nextLine();
        int lengthOfWord = word.length();
        String reverseWord = "";


        for (int i = lengthOfWord - 1; i >= 0; i--) {
            reverseWord += word.charAt(i) + "";
        }

        System.out.println(reverseWord);
    }
}

