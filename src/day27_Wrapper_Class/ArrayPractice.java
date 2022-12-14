package day27_Wrapper_Class;

import utilities.ArrayUtilities;
import utilities.StringUtilities;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40} ;

        int[] newArray = ArrayUtilities.changesElement(array, 2, 15);
        System.out.println(Arrays.toString(newArray));

        int[] array2 = {10, 20, 30, 40} ;
        int[] newArray2 = ArrayUtilities.swapsElements(array2, 1 ,3  ) ;
        System.out.println(Arrays.toString(newArray2));

        StringUtilities.retrievesFromString("EmreK425!");

        String check = "EMRE emre" ;
        System.out.println(StringUtilities.areEqualUpperLowerCase(check));


        int[] array3 = ArrayUtilities.createAIntArray() ;
        System.out.println(Arrays.toString(array3));


    }
}
