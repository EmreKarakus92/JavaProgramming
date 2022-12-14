package day13_StringClass;

import java.util.Scanner;

public class LoginCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your User Name");
        String userName = input.next();
        System.out.println("Enter Your Password");
        String password = input.next();

        if (userName.equals("Cydeo") && password.equals("WoodenSpon")){
            System.out.println("Logged In");
        } else {
            System.out.println("Incorrect username or password");
        }




    }
}
