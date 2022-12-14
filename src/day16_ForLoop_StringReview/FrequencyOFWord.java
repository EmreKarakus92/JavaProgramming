package day16_ForLoop_StringReview;

import java.util.Scanner;

public class FrequencyOFWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a sentence");
        String sentence = input.nextLine();

        System.out.println("Please enter the word you want to search");
        String word = input.next();

        int lengthOfSentence = sentence.length();
        int lengthOfWord = word.length();

        String str = "";
        int frequencyOfWord = 0;

        for (int i = 0; i <= (lengthOfSentence - lengthOfWord); i++) {
            str = sentence.substring(i, i + lengthOfWord);
            if (str.equalsIgnoreCase(word)) frequencyOfWord++;
        }

        System.out.println("frequencyOfWord = " + frequencyOfWord);


    }
}
