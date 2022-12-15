package day39_Recap.personTask;

public class Student extends Person {

    private int studentID ;
    private String fieldOfStudy ;

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        if (studentID<0){
            System.err.println("Invalid Student ID");
            System.exit(1);
        }
        this.studentID = studentID;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if(fieldOfStudy == null){
            System.err.println("Invalid field");
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public void study(){
        System.out.println("Student " + getName() + " is studying");
    }

    public Student(String name, int age, char gender, int studentID, String fieldOfStudy) {
        super(name, age, gender);
        setFieldOfStudy(fieldOfStudy);
        setStudentID(studentID);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                "field of study='" + fieldOfStudy + '\'' +
                "student ID='" + studentID + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                '}';
    }
}
