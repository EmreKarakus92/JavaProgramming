package day17_While_DoWhile;

import java.util.Scanner;

public class DivisibleBy3515 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number = input.nextInt();

        String divisibleBy15 = "";
        String divisibleBy5 = "";
        String divisibleBy3 = "";

        for (int i = 1; i <= number; i++) {
            if ((i % 15) == 0) divisibleBy15 += " " + i;
            else if ((i % 5) == 0) divisibleBy5 += " " + i;
            else if ((i % 3) == 0) divisibleBy3 += " " + i;

        }

        System.out.println("divisibleBy15 = " + divisibleBy15);
        System.out.println("divisibleBy5 = " + divisibleBy5);
        System.out.println("divisibleBy3 = " + divisibleBy3);

    }


}

