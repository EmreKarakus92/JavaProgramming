package day30_Custom_Class_Intro;

public class CapitalOne {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("Emre", 'M', 30 ,3922 , "QA", 3000, true );

        Employee employee2 = new Employee();
        employee2.setInfo("Osman", 'M', 29 ,2305 , "Dev", 3500, false );

        Employee employee3 = new Employee();
        employee3.setInfo("Adem", 'M', 31 ,3204 , "BA", 4000, false );

        Employee employee4 = new Employee();
        employee4.setInfo("Orhan", 'M', 35 ,4024 , "Tester", 4500, true );

        Employee employee5 = new Employee();
        employee5.setInfo("Tolga", 'M', 30 ,3823 , "Engineer", 3500, true );

        System.out.println(employee1);

        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};

        double minSalary = 1000000 ;
        double maxSalary = 0 ;
        int countIsFullTime = 0 ;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].isFullTime) countIsFullTime++;
            if (employees[i].salary>maxSalary) maxSalary=employees[i].salary ;
            if ((employees[i].salary<minSalary)) minSalary = employees[i].salary;

        }
        System.out.println("countIsFullTime = " + countIsFullTime);
        System.out.println("maxSalary = " + maxSalary);
        System.out.println("minSalary = " + minSalary);

    }
}
