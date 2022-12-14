package day19_Recap_Loop_String;

import java.util.Scanner;

public class Highest_Frequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Please enter a sentence");
        String sentence = input.nextLine();

        int lengthOfSentence = sentence.length();
        int count = 0;
        int maxCount = 0 ;
        char eachChar ;
        char checkChar ;
        String result = "";
        for(int i = 0 ; i<lengthOfSentence ; i++){
            eachChar = sentence.charAt(i);
            for(int j = 0 ; j<lengthOfSentence ; j++){
                checkChar = sentence.charAt(j) ;
                if (eachChar==checkChar) count++ ;
            }
            if(count>maxCount){
                maxCount = count ;
                result = "" + eachChar + " " ;
            }
            if(count==maxCount){
                if(!(result.contains("" +eachChar)))
                result += "" + eachChar + " " ;
            }
            count = 0 ;
        }

        System.out.println(maxCount);
        System.out.println(result);

    }
}
