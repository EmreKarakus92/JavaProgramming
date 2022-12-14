package day18_NestedLoop;

import java.util.Scanner;

public class UniqueChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Please enter a sentence");
        String sentence = input.nextLine();
        int lengthOfSentence = sentence.length();
        int count = 0 ;
        String result = "" ;

        for(int i = 0 ; i<lengthOfSentence ; i++){
            char eachChar = sentence.charAt(i);
            for(int j = 0 ; j<lengthOfSentence ; j++){
                char controlChar = sentence.charAt(j);
                if(controlChar==eachChar) count++ ;
            }
                if(count<2) result += eachChar ;
                count = 0 ;

        }
        System.out.println(result);
    }
}



