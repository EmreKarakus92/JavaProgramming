package day28_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class SetZeroToLastElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        ArrayList <Integer> arr1 = new ArrayList<>() ;

        System.out.println("Please enter the number elements of ArrayList");
        int lengthOfArrayList = input.nextInt();

        for (int i = 0; i < lengthOfArrayList; i++) {
            System.out.println("Please enter the " + (i+1) + ". element of ArrayList.");
            arr1.add(input.nextInt());
        }

        System.out.println(arr1);

        arr1.set(lengthOfArrayList-1, 0) ;
        System.out.println(arr1);

    }
}
