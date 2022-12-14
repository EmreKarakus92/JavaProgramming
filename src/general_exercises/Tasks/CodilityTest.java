package general_exercises.Tasks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CodilityTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a Positive number");
        int number = input.nextInt();
        String result = "";
        if (number > 0) {
            if ((number % 2) == 0) {
                result = "codility";
            }
            if ((number % 3) == 0) {
                result += "test";
            }
            if ((number % 5) == 0) {
                result += "coders";
            }

            if((number % 2) != 0 && (number % 3) != 0 && (number % 5) != 0) {
                result = number + " is not devisible for 2, 3 and 5" ;
            }

        } else {
            System.out.println("Error. The number is not positive");
        }

        System.out.println(result);


    }
}

