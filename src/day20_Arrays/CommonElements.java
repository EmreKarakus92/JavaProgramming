package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of elements of first array");
        int lengthOfFirstArray = input.nextInt();
        int[] firstArray = new int[lengthOfFirstArray];

        for (int i = 0; i < firstArray.length; i++) {
            System.out.println("Please enter " + (i + 1) + ". for first array.");
            firstArray[i] = input.nextInt();
        }

        System.out.println("Please enter the number of elements of second array");
        int lengthOfSecondArray = input.nextInt();
        int[] secondArray = new int[lengthOfSecondArray];

        for (int i = 0; i < secondArray.length; i++) {
            System.out.println("Please enter " + (i + 1) + ". for second array.");
            secondArray[i] = input.nextInt();
        }

        int count = 0;
        int countForNewArray = 0 ;
        String result = "";

        for (int i = 0; i < firstArray.length; i++) {
            for (int i1 = 0; i1 < secondArray.length; i1++) {
                if (firstArray[i] == secondArray[i1]) count++;
            }
            if (count > 0 && !(result.contains("" + firstArray[i]))) {
                result += firstArray[i] + " ";
                countForNewArray++;
            }
            count = 0 ;
        }
        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));
        System.out.println(result);

        String[] newArray = new String[countForNewArray] ;
        int newCount =0 ;
        for (int i = 0; i < newArray.length; i++) {
            newArray[i]= result.substring(newCount , result.indexOf(" ")) ;
            result = result.substring(result.indexOf(" ") + 1) ;

        }

        System.out.println(Arrays.toString(newArray));

    }
}
