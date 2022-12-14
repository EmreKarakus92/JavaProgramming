package day10_NestedIf_Tenary.tasks;

public class BiggerNumber {
    public static void main(String[] args) {

        int n1 = 15 ;
        int n2 = 12 ;
        int n3 = 11 ;
        int biggerNumber = (n1>n2 && n1>n3)? n1 :(n2>n1 && n2>n3)? n2 : n3 ;
        System.out.println("Biggest Number is " + biggerNumber);







    }
}
