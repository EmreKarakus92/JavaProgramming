package day37_Inheritance;

import day37_Inheritance.SuperMarketTask;

public class PreparedFoods extends SuperMarketTask {

    public boolean isCooked ;
    public int insidePackageNumber ;

    public PreparedFoods(String nameOfItem, String category, int quantity, double price, int expirationYear, boolean isCooked, int insidePackageNumber) {
        super(nameOfItem, "Prepared Foods", quantity, price, expirationYear);
        this.isCooked = isCooked ;
        this.insidePackageNumber = insidePackageNumber ;
    }
}
