package day09_IfStatements.tasks;

public class Finra {
    public static void main(String[] args) {
        int number = 7;
        String output ;
        if ((number % 5) == 0 && (number % 3) == 0) {
            output = "FINRA";
            System.out.println(output);
        } else if ((number % 5) == 0) {
            output = "RA";
            System.out.println(output);
        } else if ((number % 3) == 0) {
            output = "FIN";
            System.out.println(output);
        } else {
            System.out.println(number);
        }


    }
}
