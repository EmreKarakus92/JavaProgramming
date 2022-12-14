package day16_ForLoop_StringReview;

import java.util.Scanner;

public class FrequencyOfaChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Please enter a sentence");
        String sentence = input.nextLine();
        System.out.println("Please enter a character");
        char ch = input.next().charAt(0);

        int lengthOfSentence = sentence.length();
        char forCh = 'a' ;
        int frequencyOfChar = 0 ;


        for(int i = 0 ; i<lengthOfSentence ; i++) {

            forCh = sentence.charAt(i);
            if(forCh==ch) frequencyOfChar++;

        }

        System.out.println("frequencyOfChar = " + frequencyOfChar);

    }
}
