package day17_While_DoWhile;

import java.util.Scanner;

public class InsuranceQuote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Please enter your name");
        String name = input.nextLine();
        System.out.println("What is your gender?");
        String gender = input.next();
        while (!(gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female"))) {
            System.out.println("What is your gender?");
            gender = input.next();
        }
        System.out.println("Please enter your age. (0-120 years old)");
        int age = input.nextInt();

        while (!(age>0 && age<=120)) {
            age = input.nextInt();
        }

        System.out.println("Are you married");
        String isMarried = input.next();

        System.out.println("How many miles do you drive a day ?");
        int miles = input.nextInt();

        while(!(miles>=5)){
            System.out.println("How many miles do you drive a day ?");
            miles = input.nextInt();
        }
        System.out.println("Do you want full coverage or liability insurance?");
        input.nextLine();
        String insurance = input.nextLine();

        System.out.println("did you have any accidents or claims in past 5 years (Yes/No)");
        String accident = input.next();
        while(!(accident.equalsIgnoreCase("yes")||accident.equalsIgnoreCase("no"))){
            System.out.println("did you have any accidents or claims in past 5 years (Yes/No)");
            accident = input.next();
        }

        System.out.println("Is your car anti-theft device");
        String theft = input.next();
        while(!(theft.equalsIgnoreCase("yes")||theft.equalsIgnoreCase("no"))){
            System.out.println("Do you want anti-theft device");
            theft = input.next();
        }

        int ageLiabilityPrice = (age<25)? 90 : 50 ;
        int milesLiabilityPrice = (miles<=10)? 10 : (miles<=50)? 30 : 50 ;
        int ageFullCoveragePrice = (age<25)? 160 : 120 ;
        int milesFullCoveragePrice = (miles<=10)? 20 : (miles<=50)? 40 : 70 ;

        int price = 0 ;
        if(insurance.equalsIgnoreCase("full coverage")) price = ageFullCoveragePrice + milesFullCoveragePrice ;
        if (insurance.equalsIgnoreCase("liability")) price = ageLiabilityPrice + milesLiabilityPrice ;

        System.out.println("Starting Price: " + price + "$");
        if(theft.equalsIgnoreCase("yes")) {
            price *= 0.95;
            System.out.println("theft = " + theft + " and current price is : " + price);
        }
        if(accident.equalsIgnoreCase("yes")) {
            price *= 1.15 ;
            System.out.println("accident = " + accident + " and current price is: " + price);
        }
        if(accident.equalsIgnoreCase("no")) {
            price *= 0.9 ;
            System.out.println("accident = " + accident + " and current price is: " + price);
        }

        if(isMarried.equalsIgnoreCase("yes")) {
            price *= price*.95 ;
            System.out.println("isMarried = " + isMarried);
        }

        System.out.println("Total Price is:" + price);



    }
}
