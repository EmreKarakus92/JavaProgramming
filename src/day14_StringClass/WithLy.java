package day14_StringClass;

import java.util.Scanner;

public class WithLy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your word");
        String word = input.next();
        int lengthOfWord = word.length();
        String wordly = word.substring(lengthOfWord-2) ;

        String result = (wordly.equals("ly")) ? "really???" : "never mind" ;

        System.out.println(result);

    }
}
