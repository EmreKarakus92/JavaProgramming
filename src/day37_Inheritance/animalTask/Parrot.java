package day37_Inheritance.animalTask;

public class Parrot extends Animal{
    public Parrot(String name, String breed, char gender, char size, int age, String color) {
        super(name, breed, gender, size, age, color);
    }

    public void speaking(){
        System.out.println(name + " is speaking");
    }
}
