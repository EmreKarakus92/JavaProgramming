package day37_Inheritance.SuperMarketTask;

import java.util.ArrayList;
import java.util.Arrays;

public class SuperMarket {

    public static void main(String[] args) {

        Fruits fruit1 = new Fruits("Banana", 3, 15, 2023, "Yellow", 'A') ;
        Fruits fruit2 = new Fruits("Apple", 5, 5, 2023, "Red", 'A') ;
        Fruits fruit3 = new Fruits("Grape", 10, 4, 2022, "Purple", 'C');

        ArrayList<Fruits> fruits = new ArrayList<>();
        fruits.addAll(Arrays.asList(fruit1,fruit2,fruit3)) ;
        Fruits[] fruitsArray = fruits.toArray(new Fruits[fruits.size()]);

        double priceOfFruit  = totalPriceOfFruitsChart(fruitsArray) ;

        for (Fruits fruit: fruitsArray) {
            System.out.println(fruit.getNameOfItem() + " " +fruit.quantity+ " Pieces $" + fruit.calcPrice() );
        }
        System.out.println("Total Price Of Fruits chart is $" + priceOfFruit);

        Bakery bakery1 = new Bakery("Bread",5,2, 2023, true);
        Bakery bakery2 = new Bakery("Cake", 1, 20, 2022, false);
        Bakery bakery3 = new Bakery("Donut", 5,3,2024, false) ;

        ArrayList<Bakery> bakeryArrayList = new ArrayList<>(Arrays.asList(bakery1,bakery2,bakery3));
        Bakery[] bakeries = new Bakery[bakeryArrayList.size()];
        bakeryArrayList.toArray(bakeries);

        double priceOfBakeries = totalPriceOfBakeriesChart(bakeries) ;


        PreparedFoods preparedFoods1 = new PreparedFoods("Pizza", "Prepared Foods", 3, 20, 2026, true, 3);
        PreparedFoods preparedFoods2 = new PreparedFoods("Meat", "Prepared Foods", 1, 40, 2026, false, 4);
        PreparedFoods preparedFoods3 = new PreparedFoods("Chicken", "Prepared Foods", 2, 20, 2026, false, 1);

        ArrayList<PreparedFoods> preparedFoodsArrayList = new ArrayList<>(Arrays.asList(preparedFoods1, preparedFoods2,preparedFoods3));
        PreparedFoods[] preparedFoodsArray = preparedFoodsArrayList.toArray(new PreparedFoods[preparedFoodsArrayList.size()]);

        double priceOfPreparedFoods = totalPriceOfPreparedFoodsChart(preparedFoodsArray);

        double[] totalPriceArray = {priceOfBakeries, priceOfFruit, priceOfPreparedFoods} ;

        System.out.println(totalPriceOfAllCharts(totalPriceArray));


    }

    public static double totalPriceOfFruitsChart(Fruits[] fruitArg){
        double totalPriceForFruitChart = 0 ;
        for(int i = 0 ; i<fruitArg.length; i++){
            totalPriceForFruitChart += fruitArg[i].calcPrice() ;
        }
        return totalPriceForFruitChart ;
    }

    public static double totalPriceOfBakeriesChart(Bakery[] bakeryArg){
        double totalPriceForBakeryChart = 0 ;
        for (int i = 0; i < bakeryArg.length; i++) {
            totalPriceForBakeryChart += bakeryArg[i].calcPrice();
        }
        return totalPriceForBakeryChart ;
    }

    public static double totalPriceOfPreparedFoodsChart(PreparedFoods[] preparedFoodsArg){
        double totalPriceForPreparedFoods = 0 ;
        for (int i = 0; i < preparedFoodsArg.length; i++) {
            totalPriceForPreparedFoods += preparedFoodsArg[i].calcPrice() ;
        }
        return totalPriceForPreparedFoods ;
    }

    public static double totalPriceOfAllCharts(double[] totalPriceArrayArg){
        double totalPrice = 0 ;
        for (int i = 0; i < totalPriceArrayArg.length; i++) {
            totalPrice += totalPriceArrayArg[i];
        }
        return totalPrice ;
    }



    }




