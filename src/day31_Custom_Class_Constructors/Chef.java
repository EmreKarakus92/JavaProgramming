package day31_Custom_Class_Constructors;

public class Chef {
    public String  name ;
    public int employeeID ;
    public double hourlyRate ;
    public boolean fullTime ;

    public Chef(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }

    public void makeOrder(){
        System.out.println(name + "is making an order");
    }

    public void washDishes(){
        System.out.println(name + "is washing the dishes");
    }

    String time = (fullTime)? "full-time" : "part-time" ;

    @Override
    public String toString() {
        return "Chef{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + time +
                '}';
    }
}
