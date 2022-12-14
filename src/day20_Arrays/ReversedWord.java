package day20_Arrays;

import java.util.Scanner;

public class ReversedWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter numbers of elements in the array");
        int lengthOfArray = input.nextInt();

        String[] array = new String[lengthOfArray];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter " + (i + 1) + ". word");
            array[i] = input.next();
        }
        String result = "";
        for (int i = 0; i < array.length; i++) {
            String aWord = array[i];
            int lengthOfWord = aWord.length();
            for (int i1 = lengthOfWord - 1; i1 >= 0; i1--) {
                result += "" + aWord.charAt(i1);
            }
            System.out.println(result);
            result = "";
        }


    }

}
