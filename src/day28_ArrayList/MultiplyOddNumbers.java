package day28_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiplyOddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        ArrayList<Integer> arrayList1 = new ArrayList<>() ;
        System.out.println("enter element numbers");
        int lengthOfArrayList = input.nextInt();

        for (int i = 0; i < lengthOfArrayList; i++) {
            arrayList1.add(input.nextInt());
        }

        System.out.println(arrayList1);
        int temp = 0 ;
        for (int i = 0; i < lengthOfArrayList; i++) {
            if(arrayList1.get(i)%2 == 1) {
                temp = arrayList1.get(i) * 2;
                arrayList1.set(i,temp);
            }
        }
        System.out.println("arrayList1 = " + arrayList1);

    }
}
