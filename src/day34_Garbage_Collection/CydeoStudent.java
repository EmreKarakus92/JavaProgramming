package day34_Garbage_Collection;

public class CydeoStudent {

    public String studentName ;
    public static String schoolName ;

    public CydeoStudent(String studentName){
        this.studentName = studentName ;
    }

    static {
        schoolName = "Cydeo School" ;
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "studentName='" + studentName + '\'' +
                "schoolName='" + schoolName + '\'' +
                '}';
    }
}

    class CydeoStudentObject{

        public static void main(String[] args) {

            CydeoStudent student1 = new CydeoStudent("emre") ;
            CydeoStudent student2 = new CydeoStudent("mehmet") ;

            System.out.println(student1.studentName);
            System.out.println(student2.schoolName);
            System.out.println(student1);


        }
    }


