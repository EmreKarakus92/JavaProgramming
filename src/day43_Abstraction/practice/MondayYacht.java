package day43_Abstraction.practice;

public class MondayYacht extends Ship {

    private final int capacityOfPerson;

    public MondayYacht(String model, int year, double price, String color, String originOfFlag, int capacityOfPerson) {
        super("MondayYacht", model, year, price, color, originOfFlag);
        this.capacityOfPerson = capacityOfPerson;
    }

    public int getCapacityOfPerson() {
        return capacityOfPerson;
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
                ", year=" + getYear() +
                ", capacity=" + getCapacityOfPerson() +
                ", originOfFlag=" + getOriginOfFlag() +
                ", price=" + getPrice() +
                ", color='" + getColor() + '\'' +
                '}';
    }
}
