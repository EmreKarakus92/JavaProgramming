package day39_Recap.personTask;

public class Teacher extends Employee{
    public Teacher(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    @Override
    public void work() {
        super.work();
    }


}
