package day42_Exceptions.practice;

public class PracticeTwo {

    public static void sleep(double seconds) throws InterruptedException {
        Thread.sleep((long)(seconds*1000));
        System.out.println("Throws");

    }

    public static void sleepTryCatch(double seconds){
        try {
            Thread.sleep((long)(seconds*1000));
            System.out.println("Try Block");
        } catch (InterruptedException e){
            e.printStackTrace();
            System.out.println("Catch Block");
        }

    }

    public static void main(String[] args) throws InterruptedException {
        sleep(2);
        sleepTryCatch(3);
    }


}
