package day35_Encapsulation;

public class Item {

    private String name ;
    private double unitPrice ;
    private int quantity ;

    public Item(String name, double unitPrice, int quantity){
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public String getName(){
        return name ;
    }

    public double getUnitPrice(){
        return unitPrice ;
    }

    public int getQuantity(){
        return quantity ;
    }

    public void setName(String name){
        if(name.isEmpty() || name.isBlank()){
            System.err.println("Name can not be empty or blank");
            return;
        }

        for (int i = 0; i < name.length(); i++) {
            if(Character.isDigit(name.charAt(i))){
            }
            else if(Character.isLetter(name.charAt(i))){
            }
            else{
                if(!(name.charAt(i)==' ')){
                    System.err.println("Name must not have special characters");
                    return;
                }
            }

        }

        if(!(Character.isLetter(name.charAt(0)))){
            System.err.println("Name should start with letter");
            return;
        }

        this.name = name ;
    }

    public void setUnitPrice(double unitPrice){
        if(unitPrice<=0){
            System.err.println("Unit price should be bigger than 0");
            return;
        }
        this.unitPrice = unitPrice ;
    }

    public void setQuantity(int quantity){
        if(quantity<=0){
            System.err.println("Invalid quantity");
            return;
        }

        if(name.equalsIgnoreCase("toilet paper") && quantity>1) {
            System.err.println("Quantity of Toilet paper must not be bigger than 1");
            return;
        }

        this.quantity = quantity ;
    }

    public double calcCost(){
        double totalCost = quantity * unitPrice ;
        return totalCost ;
    }

    @Override
    public String toString() {
        return "Item{" +
                "Name ='" + name + '\'' +
                ", Unit Price =" + unitPrice +
                ", Quantity =" + quantity +
                ", Total Cost =" + calcCost() +
                '}';
    }
}
/*
private variables:
	            	name, unitPrice, quantity

            	Encapsulate all the fields:
            		Conditions:
            			name can not be empty or blank
            			name can not contain any special characters other than space
            			name must start with letters
            			unit price can not be negative
            			quantity can not be negative
            			if the Item name is toilet paper (case insensitive) then the quantity can not be more than 1


            Add a constructor that allows user to set all the fields when the object is created.
						(If the arguments not valid it should not be set to the instances)

            instance methods:
                calcCost(): returns the total cost
                toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()
 */