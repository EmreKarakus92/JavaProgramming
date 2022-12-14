package general_exercises;

import java.util.Scanner;

public class TriangleShape {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the last number of tree"); //get bottom number of tree from users
        int lastNumber = input.nextInt();

        for (int i = 1; i <= lastNumber; i++) {      //this for creates line of tree
            int printNumber = (i * 2) - 1;          //this variable determines numbers of "i" number to print
            for (int j = lastNumber - i; j > 0; j--) {  //this for determines numbers of spare before printing i number
                System.out.print(" ");
            }
            for (int k = 1; k <= printNumber; k++) { // this for print i numbers
                System.out.print(i);
            }
            for (int j = lastNumber - i; j > 0; j--) {  //this for determines numbers of spare after printing i number
                System.out.print(" ");
            }
            printNumber = 1; // 1 is assigned to printNumber to determine how much time "i" will be printed for next iteration of i
            System.out.println();

        }


    }
}
