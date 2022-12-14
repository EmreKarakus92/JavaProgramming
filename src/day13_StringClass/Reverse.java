package day13_StringClass;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a word with 5 character");
        String word = input.next();
        int lengthOfWord = word.length();

        if (lengthOfWord == 5 ){
            System.out.println("" + word.charAt(lengthOfWord-1)+
                    word.charAt(lengthOfWord-2) +
                    word.charAt(lengthOfWord-3) +
                    word.charAt(lengthOfWord-4) +
                    word.charAt(lengthOfWord-5)) ;
        } else{
            if(lengthOfWord<5) System.out.println("Too Short");
            else System.out.println("Too Long");
        }







    }
}
