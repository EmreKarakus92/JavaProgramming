package day33_Statics;

public class CircleObject {

    public static void main(String[] args) {

        Circle circle1 = new Circle(5);
        System.out.println("circle1 = " + circle1);

        System.out.println(circle1.calcArea());
        System.out.println(circle1.calcPerimeter());

    }

}
