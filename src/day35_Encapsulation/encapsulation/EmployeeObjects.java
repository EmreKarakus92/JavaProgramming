package day35_Encapsulation.encapsulation;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Mehmet", 'D', 31, 2600);
        System.out.println("employee1 = " + employee1);
        employee1.setName("Emre");
        employee1.setGender('M');
        employee1.setAge(30);
        employee1.setSalary(2500);

        System.out.println("employee1 = " + employee1);

        employee1.setSalary(employee1.getSalary()+1500);
        System.out.println("employee1 = " + employee1);



    }

}
