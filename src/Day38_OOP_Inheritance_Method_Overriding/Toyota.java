package Day38_OOP_Inheritance_Method_Overriding;

public class Toyota extends CarTask {


    public Toyota(String model, String color, int year, int miles, double price) {
        super("Toyota", model, color, year, miles, price);
    }

    public void reliable(){
        System.out.println(brand + " " + model + " is reliable");
    }



}
