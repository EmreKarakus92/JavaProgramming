package day37_Inheritance;

public class SuperMarketTask {

    private String nameOfItem;
    private String category ;
    public int quantity ;
    public double price ;
    public int expirationYear ;
    private boolean isDiscounted ;
    private boolean isFresh ;

    public static int currentYear = 2022 ;

    public SuperMarketTask(String nameOfItem,String category, int quantity, double price, int expirationYear){
        this.quantity = quantity ;
        this.price = price ;
        this.expirationYear = expirationYear ;
        setNameOfItem(nameOfItem);
        setCategory(category);
        setDiscounted(quantity);
        setFresh(expirationYear);

    }

    public String getNameOfItem() {
        return nameOfItem;
    }

    public String getCategory() {
        return category;
    }

    public boolean getIsDiscounted() {
        return isDiscounted;
    }

    public boolean getIsFresh() {
        return isFresh;
    }

    public void setDiscounted(int quantity) {
        isDiscounted = false ;
        if(quantity>3) isDiscounted = true ;

    }

    public void setFresh(int expirationYear) {
        isFresh = true ;
        if (expirationYear<this.currentYear) isFresh = false ;
    }

    public void setNameOfItem(String nameOfItem){
        this.nameOfItem = nameOfItem ;
    }

    public void setCategory(String category){
        this.category = category ;
    }

    public double calcPrice(){
        double totalPriceOfAItem = price * quantity ;
        return totalPriceOfAItem ;
    }

    public int expirationTime(int currentYear){
        if (currentYear>expirationYear){
            System.err.println("The product has expired.");
        }
            int restOfExpiration = expirationYear - currentYear;
            return restOfExpiration;
    }

    public String toString() {
        return "Receipt{" +
                "nameOfItem='" + nameOfItem + '\'' +
                ", category='" + category + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", totalCost=" + calcPrice() +
                ", expirationYear=" + expirationYear +
                ", isDiscounted=" + isDiscounted +
                ", isFresh=" + isFresh +
                '}';
    }
}




