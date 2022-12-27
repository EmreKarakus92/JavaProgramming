package day42_Exceptions.practice;

import java.util.Arrays;

public class PracticeOne {


    public static void main(String[] args) {


        try {
            System.out.println(110/0);
            System.out.println("Try block");
        } catch (ArithmeticException e){
            System.out.println("Catch Block");
            e.printStackTrace();

        }
        System.out.println("------------------------------------------------------");
        int[] array1 = new int[5];

        try {

            System.out.println(array1[11]);
        } catch (ArithmeticException e){
            System.out.println("ArithmeticException");
            e.printStackTrace();

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
            e.printStackTrace();
        }
        System.out.println("-------------------------------------------");


        String str = "EmreKarakus" ;

        try {
            System.out.println(str.substring(5,35));
            System.out.println("Try block");
        } catch (ArithmeticException e){
            System.out.println("ArithmeticException");
            e.printStackTrace();
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException");
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
            e.printStackTrace();
        } finally {
            System.out.println("Try and catch block are studied");
        }










    }

}
