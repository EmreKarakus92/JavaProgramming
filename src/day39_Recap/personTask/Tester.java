package day39_Recap.personTask;

import day39_Recap.personTask.Employee;

public class Tester extends Employee {


    public Tester(String name, int age, char gender, int employeeID, double salary) {
        super(name, age, gender, employeeID, "Tester", salary);
    }

    @Override
    public void work() {
        System.out.println("Tester " + getName() + " is working");
    }

    public void createTicket(){
        System.out.println("Tester " + getName() + " is creating Ticket");
    }

}
