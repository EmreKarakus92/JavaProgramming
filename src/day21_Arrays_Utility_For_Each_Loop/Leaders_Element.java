package day21_Arrays_Utility_For_Each_Loop;

import java.util.Arrays;
import java.util.Scanner;

public class Leaders_Element {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the array's element number");
        int lengthOfArray = input.nextInt();

        int array[] = new int[lengthOfArray];
        for (int i = 0; i < lengthOfArray; i++) {
            System.out.println("Please enter " + (i + 1) + (". elements."));
            array[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(array));
        String result = "";
        boolean checkLeader = true;
        for (int i = 0; i < lengthOfArray - 1; i++) {
            for (int i1 = (i + 1); i1 < lengthOfArray; i1++) {
                if (array[i] < array[i1]) checkLeader = false;
            }
            if (checkLeader) result += array[i] + " ";
            checkLeader = true;
        }

        String[] leadersArray = result.split(" ");
        System.out.println(Arrays.toString(leadersArray));

    }
}
