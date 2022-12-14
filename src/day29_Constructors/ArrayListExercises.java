package day29_Constructors;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListExercises {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>() ;
        list1.addAll(Arrays.asList("blue", "yellow", "white", "green")) ;
        System.out.println(list1);
        list1.add(0, "black") ;
        System.out.println(list1);

        System.out.println("------------------------------get------------------------------");

        String retrieveElement = list1.get(1) ;
        System.out.println(retrieveElement);

        System.out.println("---------------------------set----------------------------------");
        System.out.println("list1 = " + list1);
        list1.set(3, "purple") ;
        System.out.println(list1);

        System.out.println("------------------------remove--------------------------------------");

        list1.remove(3) ;
        System.out.println(list1);
        list1.remove("green") ;
        System.out.println(list1);

        System.out.println("------------------ contains ---------------------------------------------");
        //returns boolean

        boolean r1 = list1.contains("blue");
        System.out.println("r1 = " + r1);

        System.out.println("-------------------sort method--------------------------------------------");

        Collections.sort(list1);
        System.out.println(list1);

        System.out.println("-------------------copy----------------------------------------------------");
        // size of array should be same . Collections.copy(ToArrayList, FromArrayLis.

        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Red", "Orenge", "Grey", "Brown"));
        System.out.println("list2 = " + list2);
        Collections.copy(list2,list1);
        System.out.println("list2 = " + list2);

        System.out.println("--------------------shuffle-------------------------------------------------");

        list1.addAll(Arrays.asList("rose", "gold", "white", "black", "yellow", "blue")) ;
        System.out.println("list1 = " + list1);
        Collections.shuffle(list1);
        System.out.println("list1 = " + list1);

        System.out.println("-----------------------reverse-------------------------------------------------");
        System.out.println("list1 = " + list1);
        Collections.reverse(list1);
        System.out.println("list1 = " + list1);

        System.out.println("------------------------------extract-------------------------------------------");
        //for example sublist does not contain index 6.
        System.out.println(list1);
        list1.subList(0,3) ;
        System.out.println("list1 = " + list1);

        System.out.println("----------------------------------------clear---------------------------------");
        System.out.println("list2 = " + list2);
        list2.clear();
        System.out.println("list2 = " + list2);

        System.out.println("-------------------------------indexOf--------------------------------");
        System.out.println("list1 = " + list1);
        int a = list1.indexOf("black") ;
        System.out.println("a = " + a);

        System.out.println("------------------------------lastIndexOf-------------------------------");
        System.out.println("list1 = " + list1);
        int aa = list1.lastIndexOf("yellow");
        System.out.println("aa = " + aa);

        System.out.println("--------------------------contains---------------------------------------");
        System.out.println("list1 = " + list1);
        boolean isContained = list1.contains("red") ;
        System.out.println("isContained = " + isContained);

        System.out.println("----------------------isEmpty---------------------------------------------");
        System.out.println("list2 = " + list2);
        boolean isEmpty = list2.isEmpty() ;
        System.out.println("isEmpty = " + isEmpty);

        System.out.println("----------------BULK OPERATIONS--------------------------------------------");

        System.out.println("------------------addAll---------------------------------------------");
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(15,25,35,45,55,65));
        System.out.println("list3 = " + list3);

        System.out.println("-------------toArrayList------------toArray-----------------------------------------");

        String[] array1 = {"emre", "akın", "merve", "halide", "leyla"};
        ArrayList<String> list4 = new ArrayList<>(Arrays.asList(array1));

        list4.removeIf(p -> p.equalsIgnoreCase("emre")) ;
        System.out.println("list4 = " + list4);

        array1 = list4.toArray(new String[0]);
        System.out.println(Arrays.toString(array1));

        System.out.println("-----------------------addAll--------------------------");

        ArrayList<Integer> list5 = new ArrayList<>();
        list5.addAll(Arrays.asList(5,15,25,35,45)) ;

        System.out.println("list5 = " + list5);

        System.out.println("-----------------retainAll-----------------------------");
        System.out.println("list5 = " + list5);
        list5.retainAll(Arrays.asList(15,25,35));
        System.out.println("list5 = " + list5);

        System.out.println("-----------------removeAll-----------------------------");
        System.out.println("list5 = " + list5);
        list5.removeAll(Arrays.asList(15,25));
        System.out.println("list5 = " + list5);

        System.out.println("-----------------------Collections-----------------------");

        System.out.println("-----------------------sort-------------------------------");
        ArrayList<Integer> list6 = new ArrayList<>();
        list6.addAll(Arrays.asList(5,95,25,35,55,45,65,75,85,15));
        System.out.println("list6 = " + list6);
        Collections.sort(list6);
        System.out.println("list6 = " + list6);

        System.out.println("-----------------reverse----------------------------------");
        System.out.println("list6 = " + list6);
        Collections.reverse(list6);
        System.out.println("list6 = " + list6);

        System.out.println("----------------------swap---------------------------------");
        System.out.println("list6 = " + list6);
        Collections.swap(list6,0,6);
        System.out.println("list6 = " + list6);

        System.out.println("-------------max-------------min----------------------------");
        int b = Collections.max(list6);
        System.out.println("b = " + b);

        int bb = Collections.min(list6);
        System.out.println(bb);

        System.out.println("----------------------replaceAll-------------------------------");
        ArrayList<String> list7 = new ArrayList<>(Arrays.asList("emre", "merve", "akın", "halide", "leyla", "emre", "akın", "akın")) ;
        System.out.println("list7 = " + list7);
        Collections.replaceAll(list7,"emre","akın") ;
        System.out.println("list7 = " + list7);

        System.out.println("----------------------------frequency--------------------------");
        System.out.println("list7 = " + list7);
        int fre = Collections.frequency(list7,"akın") ;
        System.out.println("fre = " + fre);

        ArrayList<Integer> list8 = new ArrayList<>(Arrays.asList(12,12,32,42,52,12,72,82)) ;
        System.out.println("list8 = " + list8);
        int fre2 = Collections.frequency(list8, 12) ;
        System.out.println("fre2 = " + fre2);



























    }
}
