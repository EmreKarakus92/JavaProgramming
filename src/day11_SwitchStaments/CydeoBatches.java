package day11_SwitchStaments;

import java.util.Scanner;

public class CydeoBatches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Type your name of Batch");
        String result = input.nextLine();
        //String result = "US Morning" ;

        if (result.equals("US Morning") || result.equals("US Evening") || result.equals("EU")){

            switch (result){

                case "US Morning":
                    result = "Class times are 10-5 EST. M, T, Th, F." ;
                    break;
                case "US Evening":
                    result = "Class times are 7-10 EST. M, T, W, Th, S, S" ;
                    break;
                default:
                    result = "Class times are  10-5 EST. M, T, W, Th, F." ;
                    break;
            }

        }else {
            result = "Invalid Batch's Group" ;

        }

        System.out.println(result);
        input.close();
    }
}
