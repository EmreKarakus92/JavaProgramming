package day37_Inheritance.phoneTask;

public class Samsung extends Phone{
    public Samsung(String model, String color, char size, double price) {
        super("Samsung", model, color, size, price);
    }

    public void freezing(){
        System.out.println(brand + " " + model + " is freezing");
    }
}
