package utilities;

import java.util.Arrays;

public class StringUtilities {

    // prints each character of the given string. -input:string -output:println
    public static void printEachChar(String strArg){
        for (int i = 0; i < strArg.length(); i++) {
            System.out.println(strArg.charAt(i));
        }
    }

    // returns reversed string of given string. -input:string -output:string
    public static String reversedString(String strArg){
        String reversed = "";
        for (int i = strArg.length()-1; i >= 0 ; i--) {
            reversed += strArg.charAt(i) ;

        }
        return reversed ;
    }

    // checks whether given string is Palindrome or not. -input:string -output:boolean
    public static boolean isPalindrome(String strArg){
        boolean result ;
        String reversed = reversedString(strArg);
        result = (reversed.equalsIgnoreCase(strArg)) ;
        return result;

    }

    // remove duplicates char from given String. -input:string -output:string
    public static String removeDuplicates(String strArg){
        String result = "" ;
        for (int i = 0; i < strArg.length(); i++) {
            if(!(result.contains(""+strArg.charAt(i))))
                result += strArg.charAt(i) ;
        }
        return result ;
    }

    // checks whether two string are anagram or not -input: string & string -output:boolean
    public static boolean isAnagram(String str1Arg, String str2Arg){
        str1Arg = str1Arg.toLowerCase();
        str2Arg = str2Arg.toLowerCase();

        String[] array1 = str1Arg.split("");
        String[] array2 = str2Arg.split("");

        Arrays.sort(array1);
        Arrays.sort(array2);

        boolean result = Arrays.equals(array1, array2) ;
        return result;




    }

    //retrieves digits, letters and special char from String. --input:String output:println
    public static String retrievesFromString(String str){
        String digitResult = "";
        String letterResult  = "";
        String specialCharResult = "";

        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i)))
                digitResult += str.charAt(i) + " " ;
            else if(Character.isLetter(str.charAt(i)))
                letterResult += str.charAt(i) + " " ;
            else specialCharResult += str.charAt(i) + " ";
        }
        System.out.println("digitResult = " + digitResult);
        System.out.println("letterResult = " + letterResult);
        System.out.println("specialCharResult = " + specialCharResult);

        return specialCharResult ;
    }

    //returns true if upper case number are equal to lower case number in given string --input:String --output:boolean result
    public static boolean areEqualUpperLowerCase(String strArg){
        int countUpperCase = 0 ;
        int countLowerCase = 0 ;
        for (int i = 0; i < strArg.length(); i++) {
            if(Character.isUpperCase(strArg.charAt(i)))
                countUpperCase++;
            if(Character.isLowerCase(strArg.charAt(i)))
                countLowerCase++;
        }
        boolean result = (countLowerCase==countUpperCase);
        return result;
    }




}
