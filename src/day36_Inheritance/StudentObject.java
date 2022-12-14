package day36_Inheritance;

public class StudentObject {
    public static void main(String[] args) {

        Student student1 = new Student("emre",30,'M', 'A', "Cydeo") ;
        Student student2 = new Student("leyla", 1 , 'P', '0', "No") ;
        System.out.println("student1 = " + student1);
        System.out.println("student2 = " + student2);

        student1.setAge(32);
        System.out.println("student1 = " + student1);

    }
}
