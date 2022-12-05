package day33_Statics;

public class Circle {

    public double radius ;
    public double diameter;

    public static double pi = 3.14 ;

    public Circle(double radius) {
        this.radius = radius;
        diameter = 2 * radius ;
    }

    public double calcArea(){
        double area = pi * radius * radius ;
        return area ;
    }

    public  double calcPerimeter(){
        double perimeter = 2 * radius * pi ;
        return perimeter ;
    }

    public static void printPi(){
        System.out.println("pi = " + pi);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", pi=" + pi +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
