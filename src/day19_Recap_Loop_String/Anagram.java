package day19_Recap_Loop_String;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a first word");
        String word1 = input.next();
        word1 = word1.toLowerCase();

        System.out.println("Please enter a second word");
        String word2 = input.next();
        word2 = word2.toLowerCase();

        int lengthOfWord1 = word1.length();
        int lengthOfWord2 = word2.length();

        char ch1 ;
        char ch11 ;
        char ch2 ;

        int count1=0;
        int count2=0;
        int countResult=0;

        if(lengthOfWord1==lengthOfWord2){
            for(int i =0 ; i<lengthOfWord1 ; i++){
                ch1 = word1.charAt(i) ;
                for(int j = 0 ; j<lengthOfWord1 ; j++){
                    ch11 = word1.charAt(j) ;
                    if(ch1==ch11) count1++;
                }
                for(int g = 0 ; g<lengthOfWord1 ; g++){
                    if(ch1==word2.charAt(g)) count2++;
                }
                if(count1==count2) countResult++;

            }
            if(countResult==lengthOfWord1) System.out.println("These words are anagram");
            else System.out.println("These words are not anagram");
        }else System.out.println("These words are not anagram");



    }
}
