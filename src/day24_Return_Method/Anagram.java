package day24_Return_Method;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in) ;
        System.out.println("Please enter your first word");
        String word1 = input.next();

        System.out.println("Please enter your second word");
        String word2 = input.next();

        boolean isAnagramResult = isAnagram(word1, word2) ;
        System.out.println("isAnagramResult = " + isAnagramResult);

    }

    public static boolean isAnagram(String wordArg1, String wordArg2){
        boolean result = true;
        if(wordArg1.length()==wordArg2.length()){
            char[] arr1 = wordArg1.toCharArray() ;
            Arrays.sort(arr1);
            char[] arr2 = wordArg2.toCharArray() ;
            Arrays.sort(arr2);

            for (int i = 0; i < arr1.length; i++) {
                if(!(arr1[i]==arr2[i])) result = false ;
            }
            return result ;
        } else{
            result = false ;
            return result;
        }

    }
}

