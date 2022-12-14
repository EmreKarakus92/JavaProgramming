package day21_Arrays_Utility_For_Each_Loop;

import java.util.Arrays;
import java.util.Scanner;

public class Descending_Order {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the numbers of elements of the array");
        int lengthOfArray = input.nextInt();

        int[] numbers = new int[lengthOfArray];

        for(int i = 0 ; i<lengthOfArray ; i++){
            System.out.println("Please enter " + (i + 1) + ". number.");
            numbers[i] = input.nextInt();

        }

        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        int[] descendingArray = new int[lengthOfArray] ;

        for (int i = lengthOfArray-1 , j=0 ; i >=0 ; i-- , j++) {
            descendingArray[j]=numbers[i] ;
        }

        System.out.println(Arrays.toString(descendingArray));


    }
}
