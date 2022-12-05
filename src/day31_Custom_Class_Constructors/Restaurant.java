package day31_Custom_Class_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public String owner, location ;
    public int numberOfStars ;
    public ArrayList<Server> servers = new ArrayList<>();
    public ArrayList<Chef> chefs = new ArrayList<>();

    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
    }

    public void hireServer(Server server){
        servers.add(server);
    }

    public void hireServers(Server[] servers){
        this.servers.addAll(Arrays.asList(servers)) ;
    }

    public void hireChef(Chef chef){
        chefs.add(chef);
    }

    public void hireChefs(Chef[] chefs){
        this.chefs.addAll(Arrays.asList(chefs)) ;
    }

    public void terminateServer(int id){
        servers.removeIf(p->p.employeeID==id) ;
    }

    public void terminateChef(int id){
        chefs.removeIf(p->p.employeeID==id);
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", numberOfServers=" + servers.size() +
                ", numberOfChefs=" + chefs.size() +
                '}';
    }
}
