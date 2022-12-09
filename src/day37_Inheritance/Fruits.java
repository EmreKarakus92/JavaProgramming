package day37_Inheritance;

import java.util.ArrayList;

public class Fruits extends SuperMarketTask {

    public String color;
    private char vitamin ;

    public ArrayList<Fruits> fruitsList = new ArrayList<>() ;

    public Fruits(String nameOfItem, int quantity, double price, int expirationYear, String color, char vitamin) {
        super(nameOfItem, "Fruits", quantity, price, expirationYear);
        this.color=color;
        this.setVitamin(vitamin);
    }

    public char getVitamin() {
        return vitamin;
    }

    public void setVitamin(char vitamin) {
        if(!(vitamin=='A'|| vitamin=='B' || vitamin=='C' || vitamin == 'D' || vitamin == 'E')){
            System.err.println("Invalid Vitamin Type");
        } else
        this.vitamin = vitamin;
    }

    public void addsFruits(Fruits fruit){
        fruitsList.add(fruit) ;
    }






}


