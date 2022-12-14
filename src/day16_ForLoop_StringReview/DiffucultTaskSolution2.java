package day16_ForLoop_StringReview;

import java.util.Scanner;

public class DiffucultTaskSolution2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a Sentence");
        String sentence = input.nextLine();
        sentence = sentence + " ";

        int indexOfSpace;
        int firstLetterIndex = 0;

        String aWord = "";
        String result = "";
        String reversedWord = "";

        while (sentence.contains(" ")) {
            indexOfSpace = sentence.indexOf(" ");
            aWord = sentence.substring(firstLetterIndex, indexOfSpace);
            firstLetterIndex = indexOfSpace + 1;
            sentence = sentence.replaceFirst(" ", "-");
            if (aWord.length() > 4) {
                for (int i = aWord.length() - 1; i >= 0; i--) {
                    reversedWord += aWord.charAt(i);
                }
                aWord = reversedWord;
            }

            result += aWord + " ";

        }

        System.out.println(result);

    }
}
