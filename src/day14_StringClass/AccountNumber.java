package day14_StringClass;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Please Enter your Account Number");
        String accountNumber = input.next();

        int lengthOfNumber = accountNumber.length();

        if (accountNumber.charAt(0)=='2' && accountNumber.length() == 7) System.out.println("valid");
        else if (accountNumber.charAt(0)=='5' && accountNumber.length() == 10) System.out.println("valid");
        else System.out.println("invalid");








    }
}
