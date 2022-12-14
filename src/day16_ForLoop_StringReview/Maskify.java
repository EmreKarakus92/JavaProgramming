package day16_ForLoop_StringReview;

import java.util.Scanner;

public class Maskify {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Please enter your info");
        String info = input.nextLine() ;
        String result = "" ;

        int lengthOfInfo = info.length() ;
        if(lengthOfInfo>4){
            for(int i = 0 ; i<lengthOfInfo ; i++){
                if(i<lengthOfInfo-4) {result += "#"; }
                else result += info.charAt(i) ;
            }
            System.out.println(result);
        } else System.out.println(info);

    }
}
