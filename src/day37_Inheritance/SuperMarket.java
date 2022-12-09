package day37_Inheritance;

import java.util.ArrayList;
import java.util.Arrays;

public class SuperMarket {

    public static void main(String[] args) {

        Fruits fruit1 = new Fruits("Banana", 3, 15, 2023, "Yellow", 'A') ;
        Fruits fruit2 = new Fruits("Apple", 5, 5, 2023, "Red", 'A') ;
        Fruits fruit3 = new Fruits("Grape", 10, 4, 2022, "Purple", 'C');

        ArrayList<Fruits> fruits = new ArrayList<>();
        fruits.addAll(Arrays.asList(fruit1,fruit2,fruit3)) ;
        System.out.println(fruits);

        Fruits[] fruitsArray = {fruit1, fruit2, fruit3};

        double price  = totalPriceOfFruitChart(fruitsArray) ;
        System.out.println(price);


        }

    public static double totalPriceOfFruitChart(Fruits[] fruitArg){
        int totalPriceForFruitChart = 0 ;
        for(int i = 0 ; i<fruitArg.length; i++){
            totalPriceForFruitChart += fruitArg[i].calcPrice() ;
        }
        return totalPriceForFruitChart ;
    }

    public static void readFruit(Fruits[] fruitArg){
        System.out.println(fruitArg);
    }

    }




