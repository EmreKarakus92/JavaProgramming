package Day38_OOP_Inheritance_Method_Overriding;

public class CarTask {
    public String brand, model, color ;
    public int year, miles ;
    public double price ;

    public CarTask(String brand, String model, String color, int year, int miles, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.miles = miles;
        this.price = price;
    }

    public void start(){
        System.out.println(brand + " " + model + "is starting");
    }
    public void drive(){
        System.out.println(brand + " " + model + "is starting");
    }

    @Override
    public String toString() {
        return "CarTask{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", miles=" + miles +
                ", price=" + price +
                '}';
    }
}
