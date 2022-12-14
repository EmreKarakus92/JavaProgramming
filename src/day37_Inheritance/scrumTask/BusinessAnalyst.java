package day37_Inheritance.scrumTask;

public class BusinessAnalyst extends Employee{


    public BusinessAnalyst(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, "BusinessAnalyst", id, salary, companyName);
    }

    public void analyze(){
        System.out.println(jobTitle+ " " +name + " is analyzing documents ");
    }
}
