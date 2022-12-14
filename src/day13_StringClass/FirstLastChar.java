package day13_StringClass;

import java.util.Scanner;

public class FirstLastChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a Sentence");
        String sentence = input.nextLine();
        char firstChar = sentence.charAt(0);
        int lengthOfSentence = sentence.length();
        char lastChar = sentence.charAt(lengthOfSentence - 1);
        System.out.println("First character of the sentence is " + firstChar);
        System.out.println("Last character of the sentence is " + lastChar);

    }
}
