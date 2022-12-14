package day11_SwitchStaments;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Protocol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the30 code number");
        int number = input.nextInt();
        String result = "" ;

        switch (number) {
            case 200 :
                result = "OK" ;
                break;
            case 201 :
                result = "Created" ;
                break;
            case 202 :
                result = "Accepted" ;
                break;
            case 301 :
                result = "Moved Permanently" ;
                break;
            case 304 :
                result = "Not Modified" ;
                break;
            case 307 :
                result = "Temporary Redirect" ;
                break;
            case 400 :
                result = "Bad Request" ;
                break;
            case 401 :
                result = "Unauthorized" ;
                break;
            case 403 :
                result = "Forbidden" ;
                break;
            case 404 :
                result = "Not Found" ;
                break;
            case 410 :
                result = "Gone" ;
                break;
            case 500 :
                result = "Internal Service Error" ;
                break;
            case 503 :
                result = "Service Unavailable" ;
                break;
            default:
                result = "Invalid Protocol Number" ;

        }
        System.out.println( number + " = " + result);
        input.close();





    }
}
