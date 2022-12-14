package day21_Arrays_Utility_For_Each_Loop;

import java.util.Arrays;
import java.util.Scanner;

public class Consecutive_Elements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter numbers of array elements.");
        int lengthOfArray = input.nextInt();

        int[] array = new int[lengthOfArray];

        for (int i = 0; i < lengthOfArray; i++) {
            System.out.println("Please enter " + (i + 1) + ". number of elements");
            array[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int count = 1;
        int maxCount = 1;
        String consecutiveResult = "";
        String maxConsecutiveResult = "";


        for (int i = 0; i < lengthOfArray - 2; i++) {
            if (array[i] + 1 == array[i + 1]) {

                if (count == 1) {
                    consecutiveResult = "" + array[i] + "-" + array[i + 1];
                }
                if (count > 1) {
                    consecutiveResult = "-" + array[i + 1];
                }
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                    maxConsecutiveResult = consecutiveResult;

                }
                count = 1;
                consecutiveResult = "";
            }

        }

        System.out.println(maxCount);
        System.out.println(maxConsecutiveResult);
    }
}
