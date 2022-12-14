package day13_StringClass;

import java.util.Scanner;

public class FirstLastSameChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a Sentence");
        String sentence = input.nextLine();
        char firstChar = sentence.charAt(0);
        int lengthOfChar = sentence.length();
        char lastChar = sentence.charAt(lengthOfChar-1);

        String result = (firstChar == lastChar)? "Same Letters" : "Different Letters" ;

        System.out.println(result);





    }
}
