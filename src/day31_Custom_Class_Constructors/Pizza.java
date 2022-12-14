package day31_Custom_Class_Constructors;

public class Pizza {
    public char size;
    public int numberOfCheeseTopping, numberOfPepperoniTopping ;

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public int calcCost(){
        int initialPrice = (size == 'L')? 14 : (size == 'M')? 12 : 10 ;
        int price = initialPrice + (2*numberOfCheeseTopping) + (2*numberOfPepperoniTopping) ;
        return  price ;

    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                '}';
    }
}
