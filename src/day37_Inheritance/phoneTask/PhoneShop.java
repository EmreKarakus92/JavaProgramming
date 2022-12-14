package day37_Inheritance.phoneTask;

public class PhoneShop {
    public static void main(String[] args) {

        iPhone iPhone1 = new iPhone("12 Pro Max", "Black", 'M', 1000) ;
        iPhone1.call(5534057069L);
        iPhone1.facetime("eemre@gmail.com");
        System.out.println("iPhone1 = " + iPhone1);


    }
}
