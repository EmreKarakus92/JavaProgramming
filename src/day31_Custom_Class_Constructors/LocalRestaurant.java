package day31_Custom_Class_Constructors;

public class LocalRestaurant {

    public static void main(String[] args) {

        Restaurant restaurant1 = new Restaurant("Emre", "Urla", 5) ;

        Server server1 = new Server("Akın", 3922, 15, true);
        Server server2 = new Server("Enes", 2456, 10, false);
        Server server3 = new Server("Ali", 4555, 18, false);
        Server[] servers = {server1, server2,server3} ;

        System.out.println("server3 = " + server3);

        Chef chef1 = new Chef("Halide", 4115, 20, true);
        Chef chef2 = new Chef("Merve", 2244, 15, true);
        Chef[] chefs = {chef1,chef2} ;

        restaurant1.hireChefs(chefs);
        restaurant1.hireServers(servers);

        System.out.println("restaurant1 = " + restaurant1);


    }
}
