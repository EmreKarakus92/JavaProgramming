package day21_Arrays_Utility_For_Each_Loop;

import java.util.Arrays;
import java.util.Scanner;

public class Searched_Word {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Please write the sentences");
        String sentence = input.nextLine();

        System.out.println("Please enter your first searched word");
        String searched1 = input.next() ;

        System.out.println("Please enter your second searched word");
        String searched2 = input.next() ;
        
        String[] wordsArray = sentence.split(" ") ;
        System.out.println(Arrays.toString(wordsArray));

        int count1 = 0 ;
        int count2 = 0 ;
        for (String s : wordsArray) {
            if(s.contains(".")) s=s.substring(0,s.indexOf(".")) ;
            if(s.contains(",")) s=s.substring(0,s.indexOf(",")) ;
            if(s.equalsIgnoreCase(searched1)) count1++ ;
            if(s.equalsIgnoreCase(searched2)) count2++ ;
        }

        System.out.println( searched1 + " word is used " + count1 + " times in the sentence");
        System.out.println( searched2 + " word is used " + count2 + " times in the sentence");
    }
}
