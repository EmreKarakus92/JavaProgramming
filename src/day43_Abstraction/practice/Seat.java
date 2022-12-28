package day43_Abstraction.practice;

public class Seat extends Car {

    private final boolean isFR ;

    public Seat(String model, int year, double price, String color, String typeOfFuel, boolean electricity, int kmOfCar, boolean isFR) {
        super("Seat", model, year, price, color, typeOfFuel, electricity, kmOfCar);
        this.isFR = isFR;
    }

    public boolean isFR() {
        return isFR;
    }

    @Override
    public void start() {
        System.out.println( getBrand() + " " + getModel() + " is started with key");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + getType() + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", isFR=" + isFR() +
                ", year=" + getYear() +
                ", price=" + getPrice() +
                ", typeOfFuel=" + getTypeOfFuel() +
                ", electricity=" + getElectricity() +
                ", kmOfCar=" + getKmOfCar() +
                ", color='" + getColor() + '\'' +
                '}';
    }
}
