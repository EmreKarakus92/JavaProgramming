package day39_Recap.personTask;

public class Employee extends Person {

    private int employeeID ;
    private String jobTitle ;
    private double salary ;

    public Employee(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender);
        setEmployeeID(employeeID);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        if(employeeID<0){
            System.err.println("Invalid Employee ID");
        }
        this.employeeID = employeeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if(jobTitle == null){
            System.err.println("Invalid Job Title");
        }
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<0){
            System.err.println("Invalid Salary");
            System.exit(1);
        }
        this.salary = salary;
    }

    public void work(){
        System.out.println(jobTitle + "" + getName() + " is working");
    }

    @Override
    public String toString() {
        return "Person{" +
                "Job Title='" + jobTitle + '\'' +
                "name='" + getName() + '\'' +
                "Employee ID='" + employeeID + '\'' +
                "Salaary='" + salary + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                '}';
    }
}
