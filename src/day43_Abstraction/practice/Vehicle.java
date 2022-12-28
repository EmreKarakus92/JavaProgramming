package day43_Abstraction.practice;

public abstract class Vehicle {

    private final String type, brand, model ;
    private final int year ;
    private double price ;
    private String color;

    public Vehicle(String type, String brand, String model, int year, double price, String color) {

        if(type.isEmpty()||brand.isEmpty()||model.isEmpty()){
            throw new RuntimeException("Invalid Input");
        }
        if(year<1986){
            throw new RuntimeException("Invalid Input");

        }
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.year = year;
        setPrice(price);
        setColor(color);
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public void setPrice(double price) {
        if(price<0){
            throw new RuntimeException("Invalid Price");
        }
        this.price = price;
    }

    public void setColor(String color) {
        if(color.isEmpty()||color.isBlank()){
            throw new RuntimeException("Invalid Color");
        }
        this.color = color;
    }

    public void move(){
        System.out.println( type + " " + brand + " " + model + " is moving");
    }

    public abstract void kindOfTransportation();

    public abstract void start();

    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }


}
