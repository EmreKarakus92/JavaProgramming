package general_exercises;

import java.util.Scanner;

public class CharacterType {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert a char");
        char char1 = input.next().charAt(0) ;
        boolean isUpperCase = char1 >= 'A' && char1 <= 'Z' ;
        boolean isLowerCase = char1 >= 'a' && char1 <= 'z' ;
        boolean isNotAlphabetic =  !(isUpperCase || isLowerCase) ;

        if (isUpperCase) {
            System.out.println(char1 +  " is a uppercase");
        } else if (isLowerCase) {
            System.out.println(char1 +  " is a lowercase");
        } else {
            System.out.println(char1 +  " is not a alphabetic character");
        }

    }
}
