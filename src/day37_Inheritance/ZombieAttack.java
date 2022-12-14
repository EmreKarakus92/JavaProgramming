package day37_Inheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ZombieAttack {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array = new int[8];
        int[] arrayLastDay = new int[8];


        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter population of " + (i + 1) + ". city");
            array[i] = input.nextInt();
        }

        System.out.println("Day 0 " + Arrays.toString(array));

        int day = 1;
        arrayLastDay = array.clone();

        boolean isAlive = true;
        while (isAlive) {

            for (int i = 0; i < array.length; i++) {
                if (i == 0) {
                    if (array[i + 1] == 0) array[i] = array[i] / 2;
                }
                if (!((i == 0) || i == array.length - 1)) {
                    if ((array[i - 1] == 0 && !(arrayLastDay[i - 1] == 1)) || array[i + 1] == 0)
                        array[i] = array[i] / 2;
                }
                if (i == array.length - 1) {
                    if (array[i - 1] == 0 && !(arrayLastDay[i - 1] == 1)) array[i] = array[i] / 2;
                }
            }
            System.out.println("Day " + day + " " + Arrays.toString(array));
            day++;
            arrayLastDay = array.clone();


            isAlive = false;
            for (int each : array) {
                if (!(each == 0)) {
                    isAlive = true;
                    break;
                }


            }
        }


    }


}
