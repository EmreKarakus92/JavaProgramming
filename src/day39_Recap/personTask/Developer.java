package day39_Recap.personTask;

public class Developer extends Employee{
    public Developer(String name, int age, char gender, int employeeID, double salary) {
        super(name, age, gender, employeeID, "Developer", salary);
    }

    @Override
    public void work() {
        super.work();
    }

    public void fixBugs(){
        System.out.println("Developer " + getName() + " is fixing box.");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
