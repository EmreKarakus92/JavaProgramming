package day28_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstDuplicatedElement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter elements number");
        int lengthOfArrayList = input.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < lengthOfArrayList; i++) {
            arrayList.add(input.nextInt());
        }

        System.out.println(arrayList);

        for (int each : arrayList) {
            if(!(arrayList.indexOf(each)==arrayList.lastIndexOf(each))){
                System.out.println(each);
                break;}
        }

    }
}
