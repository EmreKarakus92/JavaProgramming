package day37_Inheritance.phoneTask;

public class Phone {

    public String brand, model, color;
    public char size;
    public double price;

    public Phone(String brand, String model, String color, char size, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public void call(long phoneNumber){
        System.out.println(brand + " " + model + " is calling\n" + phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(brand + " " + model + " is texting\n" + phoneNumber);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }
}
