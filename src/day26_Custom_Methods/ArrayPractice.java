package day26_Custom_Methods;

import utilities.ArrayUtilities;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] array = {};
        int number = 55;
        int[] addedArray = ArrayUtilities.addsElement(array, number);
        System.out.println(Arrays.toString(addedArray));

        String[] array1 = {"gjhgj", "hgjhg", "ufjhkjh"};
        String str = "gjhgj";
        int freq = ArrayUtilities.frequencyOfElement(array1, str);
        System.out.println(freq);

        int[] array2 = {15, 55, 45, 53, 65};
        int index = 2;
        int[] array3 = ArrayUtilities.removeElement(array2,index);
        System.out.println(Arrays.toString(array3));



    }
}
