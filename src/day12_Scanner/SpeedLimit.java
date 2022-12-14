package day12_Scanner;

import java.util.Scanner;

public class SpeedLimit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please type your speed");
        int yourSpeed = input.nextInt();
        System.out.println("Please type speed limitation of the road");
        int speedlimit = input.nextInt();
        String result = (yourSpeed>speedlimit)? "Over the speed limit" : "Go ahead this speed" ;
        System.out.println("yourSpeed = " + yourSpeed);
        System.out.println("speedlimit = " + speedlimit);
        System.out.println(result);

    }
}
