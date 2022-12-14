package day24_Return_Method;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Please enter the word");
        String word = input.next();

        boolean isPalindromeResult = isPalindrome(word) ;
        System.out.println("isPalindromeResult = " + isPalindromeResult);
    }

    public static boolean isPalindrome(String wordArg){
        String reversedWord = "" ;
        boolean result;
        for (int i = wordArg.length()-1; i>=0 ; i--) {
            reversedWord += wordArg.charAt(i);
        }
        if(reversedWord.equalsIgnoreCase(wordArg)) result = true ;
        else result = false ;
        return result ;
    }
}
