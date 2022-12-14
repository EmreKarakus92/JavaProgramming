package general_exercises;
import java.util.Scanner;
public class Ifexercises1 {
    public static void main(String[] args) {  // Program entry point

        System.out.println("Insert the grade");
        Scanner grade = new Scanner(System.in); // Set the value of "mark" here!
        int mark = grade.nextInt();
        System.out.println("The mark is " + mark);

        // if-else statement
        if ( mark>=50 ) {
            System.out.println( "PASS" );
        } else {
            System.out.println( "FAIL" );
        }
        System.out.println( "DONE" );
    }
}
