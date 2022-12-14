package day17_While_DoWhile;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Do you want to reserve a room");
        String wantReservation = input.next();
        String infoRoom = "" ;

        while (!(wantReservation.equalsIgnoreCase("Yes")|| wantReservation.equalsIgnoreCase("No"))){
            System.out.println("Do you want to reserve a room. Please write only Yes or No");
            wantReservation = input.next();
        }

        if (wantReservation.equalsIgnoreCase("Yes")){
            System.out.println("Which type of room do you want to reserve?");
            input.nextLine();
            String room = input.nextLine();
            while(!(room.equalsIgnoreCase("King Bed")||room.equalsIgnoreCase("Queen Bad")||
                    room.equalsIgnoreCase("Single Bed"))) {
                System.out.println("Which type of room do you want to reserve?");
                room = input.nextLine();
            }
            if (room.equalsIgnoreCase("King Bed")) infoRoom = "King Bed ==> 120$ " ;
            if (room.equalsIgnoreCase("Queen Bed")) infoRoom = "Queen Bed ==> 100$ " ;
            if (room.equalsIgnoreCase("Single Bed")) infoRoom = "Single Bed ==> 120$ " ;

            System.out.println(infoRoom);


        } else System.out.println("Have nice day");



    }
}
