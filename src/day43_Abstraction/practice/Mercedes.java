package day43_Abstraction.practice;

public class Mercedes extends Car {
    private final boolean isFourmatic ;

    public Mercedes(String model, int year, double price, String color, String typeOfFuel, boolean electricity, int kmOfCar, boolean isFourmatic) {
        super("Mercedes", model, year, price, color, typeOfFuel, electricity, kmOfCar);
        this.isFourmatic = isFourmatic;
    }

    public boolean getIsFourmatic() {
        return isFourmatic;
    }

    @Override
    public void start() {
        System.out.println(getBrand() + " "+ getModel() + " is started with card " );
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + getType() + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", isFourMatic=" + getIsFourmatic() +
                ", year=" + getYear() +
                ", price=" + getPrice() +
                ", typeOfFuel=" + getTypeOfFuel() +
                ", electricity=" + getElectricity() +
                ", kmOfCar=" + getKmOfCar() +
                ", color='" + getColor() + '\'' +
                '}';
    }
}
