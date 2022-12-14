package day36_Inheritance.employeeTask;

public class Employee {

    public  String name, jobTitle ;
    public int id, age ;
    public double salary;
    public char gender;

    public void setInfo(String name, char gender, int age, int id, String jobTitle, double salary){

        this.name = name ;
        this.gender = gender ;
        this.age = age ;
        this.id = id ;
        this.jobTitle = jobTitle ;
        this.salary = salary;
    }

    public void work(){
        System.out.println(jobTitle + " " + name + " " + " is working.");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
/*
variables:
				name, gender, age, id, jobTitle, salary

			Methods:
				setInfo()
				work()
				toString()


	2.2 Create the sub class of Employee named Tester:
			variables:
				name, gender, age, id, jobTitle, salary

			Methods:
				setInfo()
				work()
				testing()
				creatingTicket()
				toString()


	2.3 Create the sub class of Employee named Developer:
			variables:
				name, gender, age, id, jobTitle, salary

			Methods:
				setInfo()
				work()
				coding()
				fixingBugs()
				toString()

 */
