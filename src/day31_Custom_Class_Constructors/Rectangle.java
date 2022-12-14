package day31_Custom_Class_Constructors;

public class Rectangle {
    public double length, width ;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area(){
        double area = length*width ;
        return area;
    }

    public double perimeter(){
        double perimeter = 2 * (length + width) ;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
