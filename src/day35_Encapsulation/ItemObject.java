package day35_Encapsulation;

public class ItemObject {
    public static void main(String[] args) {

        Item item1 = new Item("Bread", 5,3 );
        System.out.println(item1);

      //  Item item2 = new Item("Toilet Paper", 20, 5);
      //  System.out.println("item2 = " + item2);

       // Item item3 = new Item("w@ter", 2, 5);
      //  System.out.println("item3 = " + item3);

      //    Item item4 = new Item("3Milk", 10, 2);
      //    System.out.println("item4 = " + item4);

      //  Item item5 = new Item("  ", 5,5);
      //  System.out.println("item5 = " + item5);

         Item item6 = new Item("Soda", -2 , 0);
        System.out.println("item6 = " + item6);




    }
}
