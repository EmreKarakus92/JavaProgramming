package day13_StringClass;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Plase Enter your first sentence");
        String firstSentence = input.nextLine();
        System.out.println("Plase Enter your second sentence");
        String secondSentence = input.nextLine();
        int firstLength = firstSentence.length();
        int secondLength = secondSentence.length();

        String result = (firstLength > secondLength) ? firstSentence : secondSentence ;

        System.out.println("Longest sentence is " + result);

    }
}
