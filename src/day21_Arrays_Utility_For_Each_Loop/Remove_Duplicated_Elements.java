package day21_Arrays_Utility_For_Each_Loop;

import java.util.Arrays;
import java.util.Scanner;

public class Remove_Duplicated_Elements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of elements in the array");
        int lengthOfArray = input.nextInt();
        int[] array = new int[lengthOfArray];

        for (int i = 0; i < lengthOfArray; i++) {
            System.out.println("Please enter " + (i + 1) + ". number of array elements");
            array[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(array));

        int count = 0;
        String result = "";

        for (int i : array) {
            for (int i1 : array) {
                if (i == i1) count++;
            }
            if (count == 1 || !(result.contains("" + i))) {
                result += i + " ";

            }
            count = 0;
        }
        String[] removedArray = result.split(" ");
        System.out.println(Arrays.toString(removedArray));
    }
}
