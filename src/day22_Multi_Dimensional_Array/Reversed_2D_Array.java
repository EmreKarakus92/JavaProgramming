package day22_Multi_Dimensional_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Reversed_2D_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Please enter the elements number of first array.");
        int firstArrayLength = input.nextInt();
        int[] firstArray = new int[firstArrayLength] ;
        for (int i = 0; i < firstArray.length; i++) {
            System.out.println("Please enter the element");
            firstArray[i] = input.nextInt();
        }

        System.out.println("Please enter the elements number of second array.");
        int secondArrayLength = input.nextInt();
        int[] secondArray = new int[secondArrayLength];
        for (int i = 0; i < secondArrayLength; i++) {
            System.out.println("Please enter the element");
            secondArray[i] = input.nextInt();
        }

        int multiArray[][] = {firstArray, secondArray} ;


        System.out.println(Arrays.deepToString(multiArray));

        int[][] reversedMultiArray ={secondArray, firstArray} ;
        int[][] tempArray = reversedMultiArray ;
        System.out.println(Arrays.deepToString(reversedMultiArray));
        int count = 0 ;
        for (int i = 0; i < reversedMultiArray.length; i++) {
            for (int i1 = tempArray[i].length - 1; i1 >= 0; i1--) {
                reversedMultiArray[i][count] = tempArray[i][i1] ;
                count++ ;
            }
            count = 0 ;
        }

        System.out.println(Arrays.deepToString(reversedMultiArray));


    }
}
