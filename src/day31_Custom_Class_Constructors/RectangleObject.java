package day31_Custom_Class_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class RectangleObject {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(1, 2);
        Rectangle rectangle2 = new Rectangle(2, 3);
        Rectangle rectangle3 = new Rectangle(3, 4);
        Rectangle rectangle4 = new Rectangle(4, 5);
        Rectangle rectangle5 = new Rectangle(5, 6);

        ArrayList<Rectangle> rectangles = new ArrayList<>(Arrays.asList(rectangle1, rectangle2, rectangle3, rectangle4, rectangle5)) ;

        for (Rectangle rectangle: rectangles) {
            System.out.println(rectangle);
            System.out.println(rectangle.area());
            System.out.println(rectangle.perimeter());

            System.out.println();

        }

        rectangles.removeIf( p -> p.area()< 12 ) ;
        System.out.println("rectangles = " + rectangles);




    }
}
