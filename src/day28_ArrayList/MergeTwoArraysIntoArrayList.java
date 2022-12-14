package day28_ArrayList;

import utilities.ArrayUtilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArraysIntoArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Enter first array element number.");
        int lengthOfArray1 = input.nextInt();
        String[] array1 = {} ;

        for (int i = 0; i < lengthOfArray1; i++) {
            array1 = ArrayUtilities.addsElement(array1, input.next());
            System.out.println(Arrays.toString(array1));
        }
        System.out.println(Arrays.toString(array1));

        System.out.println("Enter second array element number.");
        int lengthOfArray2 = input.nextInt();
        String[] array2 = {} ;

        for (int i = 0; i < lengthOfArray2 ; i++) {
            array2 = ArrayUtilities.addsElement(array2, input.next());
        }
        System.out.println(Arrays.toString(array2));

        ArrayList<String> arrayList = new ArrayList<>() ;

        for (String s : array1) {
            arrayList.add(s) ;
        }
        for (String s : array2) {
            arrayList.add(s) ;
        }
        System.out.println("arrayList = " + arrayList);

    }
}
