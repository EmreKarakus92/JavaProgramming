package day25_Overloading_Methods;

import utilities.ArrayUtilities;
import utilities.StringUtilities;

import java.util.Arrays;
import java.util.Scanner;

public class UsingMethodsFromDifferentClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Please enter the first word.");
        String firstWord = input.nextLine();

        System.out.println("Please enter the second word.");
        String secondWord = input.nextLine();

        StringUtilities.printEachChar(firstWord);
        StringUtilities.printEachChar(secondWord);

        String reversedWord = StringUtilities.reversedString(firstWord);
        System.out.println("reversedWord = " + reversedWord);

        String removeDupChar = StringUtilities.removeDuplicates(firstWord);
        System.out.println("removeDupChar = " + removeDupChar);

        Boolean isPalindrome = StringUtilities.isPalindrome(secondWord);
        System.out.println(secondWord + " is palindrome: " + isPalindrome);

        Boolean isAnagram = StringUtilities.isAnagram(firstWord, secondWord) ;
        System.out.println("Are " + firstWord + " and " + secondWord + " anagram? " + isAnagram);

        System.out.println("-----------------------------------------------------------------------");

        int[] array1 = {15, 24, 55, 3, 64};
        int[] array2 = {96, 35, 23, 2, 14, 16} ;
        int number = 15 ;

        System.out.println(ArrayUtilities.arrayContainsNumber(array1, number));

        System.out.println(Arrays.toString(ArrayUtilities.mergeArray(array1,array2)));



    }
}
