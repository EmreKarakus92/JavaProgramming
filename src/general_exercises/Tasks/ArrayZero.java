package general_exercises.Tasks;

import java.util.Arrays;

public class ArrayZero {
    public static void main(String[] args) {

        int[] array1= {10, 0, 5, 0, 1, 0} ;
        int[] arrayEndZero = new int[array1.length] ;

        int startingIndex = 0 ;
        int endingIndex = array1.length-1 ;

        for (int each: array1) {

            if(each==5){
                arrayEndZero[endingIndex] = each ;
                endingIndex--;
            }
            else {
                arrayEndZero[startingIndex] = each ;
                startingIndex++ ;
            }

        }

        System.out.println(Arrays.toString(arrayEndZero));

    }

}
