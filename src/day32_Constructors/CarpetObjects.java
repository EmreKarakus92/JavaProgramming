package day32_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObjects {
    public static void main(String[] args) {

        Carpet carpet1 = new Carpet(2,3,60,false);
        Carpet carpet2 = new Carpet(2,3,60,true);
        Carpet carpet3 = new Carpet(4,3,50,false);

        double carpet1Price = carpet1.totalPrice() ;
        double carpet2Price = carpet2.totalPrice() ;
        double carpet3Price = carpet3.totalPrice() ;

        System.out.println("carpet1Price = " + carpet1Price);
        System.out.println("carpet2Price = " + carpet2Price);
        System.out.println("carpet3Price = " + carpet3Price);

        ArrayList<Carpet> carpets = new ArrayList<>();
        carpets.addAll(Arrays.asList(carpet1,carpet2,carpet3));

        carpets.removeIf(p-> p.totalPrice()<500);
        System.out.println("carpets = " + carpets);








    }
}
