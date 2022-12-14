package day16_ForLoop_StringReview;

import java.util.Scanner;

public class DifficultTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String sentence = input.nextLine();
        sentence = sentence + " ";
        int lengthOfSentence = sentence.length();
        int firstLetterOfaWord = 0;
        String aWord = "";
        String reversedWord = "";
        String result = "";
        for (int i = 0; i < lengthOfSentence; i++) {
            if (sentence.charAt(i) == ' ') {
                aWord = sentence.substring(firstLetterOfaWord, i);
                if (aWord.length() > 4) { // to reverse a word *******************
                    for (int i1 = aWord.length() - 1 ; i1 >= 0; i1--) {
                        reversedWord += aWord.charAt(i1);
                    }
                    aWord = reversedWord;

                } //**********************************************************
                firstLetterOfaWord = i + 1;
                result = result + aWord + " ";
            }
        }
        System.out.println(result);
    }
}
