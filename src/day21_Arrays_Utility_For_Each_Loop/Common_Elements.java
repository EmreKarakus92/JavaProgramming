package day21_Arrays_Utility_For_Each_Loop;

import java.util.Arrays;
import java.util.Scanner;

public class Common_Elements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Please enter numbers of elements of the first array");
        int lengthOfArray1 = input.nextInt();

        System.out.println("Please enter numbers of elements of the second array");
        int lengthOfArray2 = input.nextInt();

        int[] array1 = new int[lengthOfArray1] ;
        for(int i=0 ; i<lengthOfArray1 ; i++) {
            System.out.println("Please enter the " + (i+1) + ". number of the first array.");
            array1[i] = input.nextInt() ;
        }
        System.out.println(Arrays.toString(array1));

        int[] array2 = new int[lengthOfArray2] ;
        for(int i = 0 ; i<lengthOfArray2 ; i++){
            System.out.println("Please enter the " + (i+1) + ". number of the second array.");
            array2[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(array2));

        String result = "" ;

        for (int i : array1) {
            for (int i1 : array2) {
                if(i==i1 && !(result.contains("" + i)))
                    result += i + " " ;
            }

        }

        System.out.println(result);

    }
}
