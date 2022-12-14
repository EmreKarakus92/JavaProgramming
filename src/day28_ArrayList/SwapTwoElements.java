package day28_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class SwapTwoElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        ArrayList<String> arr1 = new ArrayList<>() ;
        System.out.println("Please enter the number elements of ArrayList");
        int lengthOfArrayList = input.nextInt();

        for (int i = 0; i < lengthOfArrayList; i++) {
            arr1.add(input.next()) ;
        }

        System.out.println("arr1 = " + arr1);

        String firstElement = arr1.get(0) ;
        String lastElement = arr1.get(lengthOfArrayList-1);

        arr1.set(0, lastElement);
        arr1.set(lengthOfArrayList-1,firstElement);

        System.out.println("arr1 = " + arr1);

    }

}
