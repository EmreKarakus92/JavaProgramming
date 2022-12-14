package day32_Constructors;

public class Students {

    public String name ;
    public int age ;
    public int batchNumber ;

    public Students(String name){
        this.name = name ;
    }

    public Students(String name, int age){
        this(name);
        this.age = age ;
    }

    public Students(String name, int age, int batchNumber){
        this(name, age);
        this.batchNumber = batchNumber ;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                '}';
    }
}
