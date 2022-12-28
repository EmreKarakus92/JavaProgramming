package day43_Abstraction.practice;

public abstract class Car extends Vehicle {

    private final String typeOfFuel ;
    private final boolean electricity;
    private int kmOfCar;

    public Car(String brand, String model, int year, double price, String color, String typeOfFuel, boolean electricity, int kmOfCar) {
        super("Car", brand, model, year, price, color);
        this.typeOfFuel = typeOfFuel;
        this.electricity = electricity;
        setKmOfCar(kmOfCar);
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public boolean getElectricity() {
        return electricity;
    }

    public int getKmOfCar() {
        return kmOfCar;
    }

    public void setKmOfCar(int kmOfCar) {

        if (kmOfCar<0){
            throw new RuntimeException("KM info must be equal or bigger than 0");
        }

        this.kmOfCar = kmOfCar;
    }

    @Override
    public void kindOfTransportation() {
        System.out.println(getType() + getBrand() + " moves on land");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + getType() + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", year=" + getYear() +
                ", price=" + getPrice() +
                ", typeOfFuel=" + getTypeOfFuel() +
                ", electricity=" + getElectricity() +
                ", kmOfCar=" + getKmOfCar() +
                ", color='" + getColor() + '\'' +
                '}';
    }
}
