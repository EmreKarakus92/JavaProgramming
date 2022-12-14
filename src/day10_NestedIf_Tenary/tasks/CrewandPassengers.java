package day10_NestedIf_Tenary.tasks;

public class CrewandPassengers {
    public static void main(String[] args) {
        int numberOfPassengers = 50 ;
        int crew ;
        int passengers ;

        if(numberOfPassengers==50 || numberOfPassengers==75 || numberOfPassengers == 100) {
            if(numberOfPassengers==50){
                crew = 20 ;
                passengers = 30 ;
            } else if (numberOfPassengers==75) {
                crew = 25 ;
                passengers = 50 ;
                } else {
                crew = 30;
                passengers = 70 ;
            }
            System.out.println( crew + " crew and " +passengers + " passengers");

        }else System.out.println("number is not valid");





    }

}
