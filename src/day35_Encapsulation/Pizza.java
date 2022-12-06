package day35_Encapsulation;

public class Pizza {
    private String size;
    private int numberOfCheeseTopping ;
    private int numberOfPepperoniTopic ;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopic){
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopic(numberOfPepperoniTopic);
    }

    public String getSize() {
        return size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopic() {
        return numberOfPepperoniTopic;
    }

    public void setSize(String size) {
        if(!(size.equalsIgnoreCase("Small") || size.equalsIgnoreCase("Medium")
                || size.equalsIgnoreCase("Large"))){
            System.err.println("Pizza size can be Small, Medium or Large");
            return;
        }
        this.size = size;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        if(numberOfCheeseTopping<0){
            System.err.println("Invalid Number");
            return;
        }

        if(numberOfCheeseTopping>3 && size.equalsIgnoreCase("Small")){
            System.err.println("Too much Cheese Topic");
            return;
        }

        if(numberOfCheeseTopping>4 && size.equalsIgnoreCase("Medium")){
            System.err.println("Too much Cheese Topic");
            return;
        }

        if(numberOfCheeseTopping>5 && size.equalsIgnoreCase("Large")){
            System.err.println("Too much Cheese Topic");
            return;
        }

        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public void setNumberOfPepperoniTopic(int NumberOfPepperoniTopic) {

        if(numberOfCheeseTopping<0){
            System.err.println("Invalid Value");
        }

        if(numberOfPepperoniTopic>4 && size.equalsIgnoreCase("Small")){
            System.err.println("Too much Pepperoni Topic");
            return;
        }

        if(numberOfPepperoniTopic>5 && size.equalsIgnoreCase("Medium")){
            System.err.println("Too much Pepperoni Topic");
            return;
        }

        if(numberOfPepperoniTopic>6 && size.equalsIgnoreCase("Large")){
            System.err.println("Too much Pepperoni Topic");
            return;
        }

        this.numberOfPepperoniTopic = numberOfPepperoniTopic;
    }

    public int calcCost(){
        int startingPrice = (size.equalsIgnoreCase("Small"))? 10 : (size.equalsIgnoreCase("Medium"))? 12 :
                14 ;
        int totalPrice = startingPrice + (2*numberOfCheeseTopping) + (2*numberOfPepperoniTopic) ;
        return totalPrice ;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopic +
                ", Total Cost=" + calcCost() +
                '}';
    }
}
/*
private variables:
					size, numberOfCheeseTopping, numberOfPepperoniTopping

				Encapsulate all the fields
						Conditions:
							size of the pizza can only be small, medium, large. case insensitive

							Number of cheese topping can not be negative, the maximum number of cheese topping is:
										small: 3
										medium: 4
										large: 5

							Number of pepperoni topping can not be negative, the maximum number of pepperoni topping is:

										small: 4
										medium: 5
										large: 6

				Add a constructor that allows user to set all the fields when the object is created.
								(If the arguments not valid it should not be set to the instances)


				Methods:
					calcCost(): returns the totalCost of the pizza
					toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()
 */