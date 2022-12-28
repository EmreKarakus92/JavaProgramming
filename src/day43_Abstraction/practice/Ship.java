package day43_Abstraction.practice;

public abstract class Ship extends Vehicle {

    private String originOfFlag ;

    public Ship(String brand, String model, int year, double price, String color, String originOfFlag) {
        super("Ship", brand, model, year, price, color);
        this.originOfFlag = originOfFlag;
    }

    public String getOriginOfFlag() {
        return originOfFlag;
    }

    @Override
    public void kindOfTransportation() {
        System.out.println(getType() + " " + getBrand() + " " + getModel() + " moves on sea");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + getType() + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", year=" + getYear() +
                ", originOfFlag=" + getOriginOfFlag() +
                ", price=" + getPrice() +
                ", color='" + getColor() + '\'' +
                '}';
    }
}
