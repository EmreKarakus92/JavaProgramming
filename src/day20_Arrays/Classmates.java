package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Classmates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter numbers of friends");
        int friendsNumber = input.nextInt();

        String[] fullName = new String[friendsNumber];
        input.nextLine();
        for (int i = 0; i < fullName.length; i++) {
            System.out.println("Please enter " + (i + 1) + (". friend's full name"));
            fullName[i] = input.nextLine();

        }

        System.out.println(Arrays.toString(fullName));

        for (int i = 0; i < fullName.length; i++) {
            String firstName = fullName[i].substring(0, fullName[i].indexOf(" "));
            System.out.println(firstName);

        }
        input.close();

    }
}
