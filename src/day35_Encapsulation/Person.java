package day35_Encapsulation;

public class Person {
    private String name = "default" ;
    private String lastName = "default" ;
    private int age = -1 ;

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public static class PersonObject {
        public static void main(String[] args) {

            Person person1 = new Person() ;
            System.out.println(person1.getName());
            System.out.println(person1.getLastName());
            System.out.println(person1.getAge());
            System.out.println(person1.toString());

            person1.setName("Emre");
            person1.setLastName("Karakus");
            person1.setAge(30); ;

            System.out.println(person1.getName());
            System.out.println(person1.getLastName());
            System.out.println(person1.getAge());
            System.out.println(person1.toString());

        }




    }
}
