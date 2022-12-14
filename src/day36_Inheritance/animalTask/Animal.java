package day36_Inheritance.animalTask;

public class Animal {

    public String name ;
    public String breed;
    public char gender ;
    public char size ;
    public int age ;
    public String color;

    public void setInfo(String name, String breed, char gender, char size, int age, String color){
        this.name = name ;
        this.breed = breed;
        this.gender = gender;
        this.size = size ;
        this.age = age ;
        this.color = color ;
    }

    public void eat(){
        System.out.println(name + " is eating");
    }
    public void drink(){
        System.out.println(name + " is drinking");
    }
    public void move(){
        System.out.println(name + " is moving");
    }
    public void sleep(){
        System.out.println(name + " is sleeping");
    }
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", size=" + size +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
