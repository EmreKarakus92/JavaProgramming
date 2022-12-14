package day35_Encapsulation;

public class Square {

    private double side ;

    public Square(double side){
        setSide(side);
    }

    public double getSide(){
        return side;
    }

    public void setSide(double side){
        if(side<=0){
            System.err.println("Negative value is invalid");
            return;
        }
        this.side = side ;
    }

    public double calcArea(){
        double area = side * side ;
        return area ;
    }

    public double calcPerimeter(){
        double perimeter = 4 * side ;
        return perimeter ;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                " area=" + calcArea() +
                " perimeter=" + calcPerimeter() +
                '}';
    }
}
