package day13_StringClass;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Split or No split? (Yes or No )");
        boolean split = input.nextBoolean();

        System.out.println("Enter the number of people");
        int numberOfPeople = input.nextInt();

        System.out.println("Enter the check amount");
        double checkAmount = input.nextDouble();

        double tipRate = 1;

        System.out.println("How was the service quality(Excellent Great Good Fair Poor) ");
        String serviceQuality = input.next();
        
        if (serviceQuality.equals("Excellent"))
                tipRate = 0.25;

        if (serviceQuality.equals("Great"))
            tipRate = 0.20;

        if (serviceQuality.equals("Good"))
            tipRate = 0.15;

        if (serviceQuality.equals("Fair"))
            tipRate = 0.10;

        if (serviceQuality.equals("Poor"))
            tipRate = 0.05;
        
        double totalToPay = checkAmount + checkAmount * tipRate ;
        double totalTip = checkAmount * tipRate ;
        double totalPerPerson = totalToPay / numberOfPeople ;
        double tipPerPerson = totalTip / numberOfPeople ;
        

            System.out.println("serviceQuality = " + serviceQuality);
            System.out.println("numberOfPeople = " + numberOfPeople);
            System.out.println("totalToPay = " + totalToPay);
            System.out.println("totalTip = " + totalTip);

        if (split){
            System.out.println("totalPerPerson = " + totalPerPerson);
            System.out.println("tipPerPerson = " + tipPerPerson);
        }
    
    
    
    
    
    
    
    
    
    }
}

