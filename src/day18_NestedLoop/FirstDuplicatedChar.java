package day18_NestedLoop;

import java.util.Scanner;

public class FirstDuplicatedChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Please Enter a Sentence");
        String sentence = input.nextLine();
        int count = 0 ;
        int length = sentence.length();
        String result = "" ;

        for(int i = 0 ; i<length ; i++ ) {
            char each = sentence.charAt(i);
            for(int j = 0 ; j<length ; j++ ){
                char ch = sentence.charAt(j);
                if (ch==each) count++ ;
            }
            if (count==2) {
                result = "" + each ;
                System.out.println(result);
                break;
            } else count = 0 ;
        }

    }
}
