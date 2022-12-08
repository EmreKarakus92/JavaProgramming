package day33_Statics;

public class Teacher {

    public String name, lastName, dateOfBirth ;
    public int age , id ;
    public char gender ;

    public Teacher(String name, String lastName, String dateOfBirth, int age, int id, char gender) {
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.id = id;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", gender=" + gender +
                '}';
    }
}
