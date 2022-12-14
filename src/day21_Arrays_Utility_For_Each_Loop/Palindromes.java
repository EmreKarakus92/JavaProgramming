package day21_Arrays_Utility_For_Each_Loop;

import java.util.Arrays;
import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in) ;
        System.out.println("Please enter the numbers of elements in the array");
        int lengthOfArray = input.nextInt();

        String[] array = new String[lengthOfArray] ;

        for(int i = 0 ; i<lengthOfArray ; i++){
            System.out.println("Enter the" + (i+1) + ". word");
            array[i] = input.next();
        }
        System.out.println(Arrays.toString(array));

        int lengthOfAWord ;
        int count = 0 ;
        String reversedWord = "" ;
        String result = "" ;
        for (String word : array) {
            lengthOfAWord = word.length() ;
            for(int j = lengthOfAWord-1 ; j>= 0 ; j--){
                reversedWord += "" + word.charAt(j) ;
            }
            if(word.equalsIgnoreCase(reversedWord)){
                result += word + " " ;
                count++ ;
            }
                reversedWord = "" ;
        }
        System.out.println("result = " + result);
        System.out.println("count = " + count);
    }
}
