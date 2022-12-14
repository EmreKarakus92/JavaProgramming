package day19_Recap_Loop_String;

import java.util.Scanner;

public class RemoveDuplicatedChars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String sentence = input.nextLine();

        int lengthOfSentence = sentence.length();
        String result = "" ;
        char eachChar;
        char checkChar;
        int count = 0 ;
        String results = "";


        for(int i = 0 ; i<lengthOfSentence ; i++){
            eachChar = sentence.charAt(i);
            for(int j = 0 ; j<lengthOfSentence ; j++){
                checkChar = sentence.charAt(j);
                if(eachChar==checkChar)
                    count++;
            }
            if (count == 1 || !(results.contains("" + eachChar)))
                results += "" + eachChar;
            count = 0 ;

            }
        System.out.println(results);

        }




    }

