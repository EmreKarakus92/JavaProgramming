package day14_StringClass;

import java.util.Scanner;

public class CalledEmailTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Please enter your e-mail address");
        String address = input.next();

        int indexOfUnderScore = address.indexOf('_');
        int indexOfAt = address.indexOf('@') ;

        String firstName = address.substring(0 , indexOfUnderScore) ;
        String LastName = address.substring(indexOfUnderScore+1 , indexOfAt) ;












    }
}
