package day18_NestedLoop;

import java.util.Scanner;

public class Persistence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number");
        String number = input.next();

        int multiply = 1 ;
        char ch ;
        int num = 1 ;
        boolean blue = true ;
        int dummy ;
        while(blue){
        for(int i = 0 ; i<number.length(); i++){
           ch = number.charAt(i);
           num = ch-48 ;
           multiply *= num ;
        }
           number = "" + multiply ;
           dummy = multiply ;
           blue = multiply>9 ;
           multiply = 1 ;

        }
        System.out.println(number);






    }
}
