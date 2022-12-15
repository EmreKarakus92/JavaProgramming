package day39_Recap.personTask;

public class Cydeo {

    public static void main(String[] args) {

        Developer developer1 = new Developer("Osman", 29, 'M', 2304, 2500) ;
        Tester tester1 = new Tester("Emre", 30, 'M', 3922, 2000);
        Teacher teacher1 = new Teacher("Marry", 24, 'F', 6247, "Teacher", 2300) ;
        Student student1 = new Student("Ali", 35, 'M', 6228, "SDET");

        System.out.println(developer1);
        System.out.println(tester1);
        System.out.println(teacher1);
        System.out.println(student1);

        tester1.work();
        developer1.work();
        teacher1.eat();
        student1.drink();
    }

}
