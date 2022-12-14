package day37_Inheritance.phoneTask;

public class iPhone extends Phone {
    public iPhone( String model, String color, char size, double price) {
        super("Apple", model, color, size, price);
    }


    public void facetime(long phoneNumber) {
        System.out.println(brand + " " + model + " is having facetime with phone number\n" + phoneNumber);
    }

    public void facetime(String email){
        System.out.println(brand + " " + model + " is having facetime with email\n" + email);
    }
}
