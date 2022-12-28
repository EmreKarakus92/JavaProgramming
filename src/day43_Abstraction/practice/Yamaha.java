package day43_Abstraction.practice;

public class Yamaha extends Ship {
    private int maxSpeed;

    public Yamaha(String model, int year, double price, String color, String originOfFlag, int maxSpeed) {
        super("Yamaha", model, year, price, color, originOfFlag);
        setMaxSpeed(maxSpeed);
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void start() {
        System.out.println(getBrand() + " " + getModel() + " is started with Button");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + getType() + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", year=" + getYear() +
                ", maxSpeed=" + getMaxSpeed() +
                ", originOfFlag=" + getOriginOfFlag() +
                ", price=" + getPrice() +
                ", color='" + getColor() + '\'' +
                '}';
    }
}
