package day43_Abstraction.practice;

import day43_Abstraction.car.Honda;

import java.util.ArrayList;
import java.util.Arrays;

public class Showroom {
    public static void main(String[] args) {

        Car car1 = new Seat("Leon", 2015, 450000, "White", "Benzin", false, 65000, false);
        Mercedes car2 = new Mercedes("A180", 2018, 100000, "red",
                "diesel", true, 55000, false);

        ArrayList<Car> cars = new ArrayList<>();
        cars.addAll(Arrays.asList(car1, car2));
        System.out.println("cars = " + cars);

        car1.start();
        car2.start();
        car1.move();
        car2.move();
        car1.kindOfTransportation();
        car2.kindOfTransportation();


    }

}
