package day42_Exceptions.practice;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {

        System.out.println("Please Enter your age.(Age must be between 18 - 64)");
        int age = new Scanner(System.in).nextInt();

        if(age<18 || age>64){
            try {
                throw new RuntimeException("Invalid Age");

            } catch (RuntimeException e){
                System.out.println("Catch Block");
                e.printStackTrace();
            }
        }

    }
}
