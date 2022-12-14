package day10_NestedIf_Tenary.tasks;

public class Protocol {
    public static void main(String[] args) {
        int codes = 201 ;
        String result = (codes==200 || codes==201 || codes==202 || codes==301 ||
                codes==304 || codes==303 || codes==400 || codes==401 || codes==403 ||
                codes==404 || codes==410 || codes==500 || codes==50)? (codes==200)? "OK"
                :(codes==201)? "Heyy" : "merhba" : "unvalid" ;

        System.out.println(result);


    }

}
