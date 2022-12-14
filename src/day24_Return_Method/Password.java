package day24_Return_Method;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the password");
        String password = input.next();
        String result = isValid((password));

        System.out.println(result);
    }

    public static String isValid(String passwordArg) {
        boolean lengthOfPassword = passwordArg.length() >= 8;
        boolean charConditions = true;
        for (int i = 0; i < passwordArg.length(); i++) {
            char tempChar = passwordArg.charAt(i);
            if (!((tempChar >= '0' && tempChar <= '9') ||
                    (tempChar >= 'A' && tempChar <= 'Z') ||
                    (tempChar >= 'a' && tempChar <= 'z'))) {
                charConditions = false;
                break;

            }
        }
        int count = 0;
        for (int i = 0; i < passwordArg.length(); i++) {
            char tempDigit = passwordArg.charAt(i);
            if (tempDigit >= '0' && tempDigit <= '9') count++;
        }

        boolean digitConditions = false;
        if (count > 1) digitConditions = true;

        String allConditions;
        if (lengthOfPassword && charConditions && digitConditions)
            allConditions = "Password is valid.";
        else allConditions = "Password is Not Valid";

        return allConditions;
    }
}
