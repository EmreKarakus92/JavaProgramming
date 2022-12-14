package day18_NestedLoop;

import java.util.Scanner;

public class IndexOfFirstDuplicatedChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Please Enter a Sentence");
        String sentence = input.nextLine();

        int lengthOfSentence = sentence.length();
        int indexOfDuplicatedChar = 0 ;
        int count = 0 ;

        for(int i = 0 ; i<lengthOfSentence ; i++){
            char each = sentence.charAt(i) ;
            for (int j = 0 ; j<lengthOfSentence ; j++){
                char ch = sentence.charAt(j) ;
                if (each==ch) count++ ;

            }
            if(count>1) {
                indexOfDuplicatedChar = i ;
                break;
            } else count = 0 ;
        }
        System.out.println(indexOfDuplicatedChar);
    }
}
