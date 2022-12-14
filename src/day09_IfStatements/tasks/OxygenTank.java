package day09_IfStatements.tasks;

public class OxygenTank {
    public static void main(String[] args) {
        int oxygenLevel = 78;
        if (oxygenLevel >= 0 && oxygenLevel <= 100) {
            if(oxygenLevel >= 90 ){
                System.out.println("Your Tank is full.");
            } else if (oxygenLevel>=80){
                System.out.println("Still Okey");
            } else if (oxygenLevel>=70) {
                System.out.println("Don't go too far.");
            } else if (oxygenLevel>=60) {
                System.out.println("Start to head back.");
            } else {
                System.out.println("Be careful now you at 50%");
            }

        } else {
            System.out.println("Invalid Number");
        }


    }

}