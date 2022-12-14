package general_exercises;

import javax.lang.model.SourceVersion;
import java.util.Scanner;

public class IfStatementsExercises {

    public static void main(String[] args) {
        /*Scanner firstnumber = new Scanner(System.in);
        System.out.println("Please insert first number");
        int number1 = firstnumber.nextInt() ;

        Scanner secondnumber = new Scanner(System.in);
        System.out.println("Please insert second number");
        int number2 = secondnumber.nextInt() ;56

        Scanner thirdnumber = new Scanner(System.in);
        System.out.println("Please insert third number");
        int number3 = thirdnumber.nextInt() ;





        if (number1 > number2 && number1 > number3) {
            System.out.println(number1 + " is bigger than " + number2 + " and " + number3);
        } else if (number2 > number1 && number2 > number3) {
            System.out.println(number2 + " is bigger than " + number1 + " and " + number3);
        } else {
            System.out.println(number3 + " is bigger than " + number1 + " and " + number2);
        } */

        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Please insert a number of row");
        int num1 = inputNumber.nextInt();
        for (int i = 1; i <= num1; i++) {
            for (int x = 1; x <= (num1 - i); x++) {
                System.out.print(" ");
            }
            int temp = i;
            for (int y = 1; y <= i; y++) {
                System.out.print(temp);
                temp -= 1;
            }
            int temp2 = 1;
            for (int z = 1; z <= i; z++) {
                if (z != 1) {
                    System.out.print(z);
                }
            }
            System.out.println();
        }
        for (int ii = (num1 - 1); ii >= 1; ii--) {
            int temp3 = num1 - ii;
            for (int xx = 1; xx <= temp3; xx++) {
                System.out.print(" ");
            }
            int temp4 = ii;
            for (int yy = 1; yy <= ii; yy++) {
                System.out.print(temp4);
                temp4--;
            }
            int temp5 = 1;
            for (int zz = 1; zz <= ii; zz++) {
                if (zz != 1) {
                    System.out.print(zz);


                }
            }
            System.out.println("");
        }


    }


}
