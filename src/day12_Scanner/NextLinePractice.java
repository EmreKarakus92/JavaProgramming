package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputLine = new Scanner(System.in);
        System.out.println("type your age");
        int age = input.nextInt();

        System.out.println("type your salary");
        int salary = input.nextInt();

        System.out.println("type your full name");
        //String fullName = input.nextLine();
        String fullName = inputLine.nextLine();

        // input.nextLine();
        System.out.println("type your experience");
        int experience = input.nextInt();

        System.out.println("age = " + age);
        System.out.println("salary = " + salary);
        System.out.println("fullName = " + fullName);
        System.out.println("experience = " + experience);
        input.close();
    }
}
