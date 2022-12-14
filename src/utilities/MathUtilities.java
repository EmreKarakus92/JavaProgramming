package utilities;

public class MathUtilities {

    // returns sum of two integer. --input: int number1, int number2 --output:int number
    public static int sumOfTwoElements(int num1Arg, int num2Arg){
        int sum = num1Arg + num2Arg ;
        return sum;
    }

    // returns sum of two double. --input: double number1, double number2 --output:double number
    public static double sumOfTwoElements(double num1Arg, double num2Arg){
        double sum = num1Arg + num2Arg ;
        return sum;
    }

    // returns subtraction of two int. --input: int number1, int number2 --output:int number
    public static int subtractionOfTwoElements(int num1Arg, int num2Arg){
        int sum = num1Arg - num2Arg ;
        return sum;
    }

    // returns subtraction of two double. --input: double number1, double number2 --output:double number
    public static double subtractionOfTwoElements(double num1Arg, double num2Arg){
        double sum = num1Arg - num2Arg ;
        return sum;
    }

    // returns multiplication of two int. --input: int number1, int number2 --output:int number
    public static int multiplicationOfTwoElements(int num1Arg, int num2Arg){
        int sum = num1Arg * num2Arg ;
        return sum;
    }

    // returns multiplication of two double. --input: double number1, double number2 --output:double number
    public static double multiplicationOfTwoElements(double num1Arg, double num2Arg){
        double sum = num1Arg * num2Arg ;
        return sum;
    }

    // returns division of two double. --input: double number1, double number2 --output:double number
    public static double divisionOfTwoElements(double num1Arg, double num2Arg){
        double sum = num1Arg * num2Arg ;
        return sum;
    }

    //  returns boolean and check whether given number is even or not. --input:int number --output:boolean
    public static boolean isEvenNumber(int numberArg){
        boolean result = ((numberArg%2)==0)? true : false ;
        return result;
    }

    //  returns boolean and check whether given number is odd or not. --input:int number --output:boolean
    public static boolean isOddNumber(int numberArg){
        boolean result = (!((numberArg%2)==0))? true : false ;
        return result;
    }
    
    // returns max number between two int. --input:int number1, int number2 output:int max number
    public static int maxNumberBetweenTwoNumbers(int num1Arg, int num2Arg){
        int result = (num1Arg>=num2Arg)? num1Arg : num2Arg ;
        return result;
    }

    // returns max number between two double. --input:double number1, double number2 output:double max number
    public static double maxNumberBetweenTwoNumbers(double num1Arg, double num2Arg){
        double result = (num1Arg>=num2Arg)? num1Arg : num2Arg ;
        return result;
    }

    // returns min number between two double. --input:double number1, double number2 output:double min number
    public static double minNumberBetweenTwoNumbers(double num1Arg, double num2Arg){
        double result = (num1Arg>=num2Arg)? num2Arg : num1Arg ;
        return result;
    }

    // returns min number between two int. --input:int number1, int number2 output:int min number
    public static int minNumberBetweenTwoNumbers(int num1Arg, int num2Arg){
        int result = (num1Arg>=num2Arg)? num2Arg : num1Arg ;
        return result;
    }

    // returns square of given int number. --input:int number --output:int number
    public static int squareOfANumber(int numArg){
        int square = numArg*numArg;
        return square ;
    }

    // returns square of given double number. --input:double number --output:double number
    public static double squareOfANumber(double numArg){
        double square = numArg*numArg;
        return square ;
    }






}
