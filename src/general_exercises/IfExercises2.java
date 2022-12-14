package general_exercises;

import  java.util.Scanner;

public class IfExercises2 {
    public static void main(String[] args) {

    Scanner scanAge1 = new Scanner(System.in);
        System.out.println("Please insert the first age.");
        int age1 = scanAge1.nextInt();
    Scanner scanAge2 = new Scanner(System.in);
        System.out.println("Please insert the second age.");
        int age2 = scanAge2.nextInt();
    Scanner scanAge3 = new Scanner(System.in);
        System.out.println("Please insert the third age.");
        int age3 = scanAge3.nextInt();
    if (age1>age2 && age1> age3 && age2<age3){
        System.out.println(age1 + " is the oldest \n" + age2 + " is the youngest" );
    } else if (age1>age2 && age1> age3 && age2<age3) {
        System.out.println(age1 + " is the oldest \n" + age3 + " is the youngest" );
    } else if (age2>age1 && age2> age3 && age1<age3) {
        System.out.println(age2 + " is the oldest \n" + age1 + " is the youngest" );
    } else if (age2>age1 && age2> age3 && age3<age1) {
        System.out.println(age2 + " is the oldest \n" + age3 + " is the youngest" );
    } else if (age3>age1 && age3> age1 && age1<age2) {
        System.out.println(age3 + " is the oldest \n" + age1 + " is the youngest" );
    } else {
        System.out.println(age3 + " is the oldest \n" + age2 + " is the youngest" );
    }


    }

    }

