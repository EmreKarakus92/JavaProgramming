package day39_Recap.AnimalTask;

public class Animal {

    private String name , breed, color;
    private  char gender, size ;
    private int age ;

    public Animal(String name, String breed, String color, char gender, char size, int age) {
        setName(name);
        setBreed(breed);
        setColor(color);
        setGender(gender);
        setSize(size);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.isBlank() || name.isEmpty()){
            System.err.println("Invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if(breed == null || breed.isBlank() || breed.isEmpty()) {
            System.err.println("Invalid breed");
            System.exit(1);
        }
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color == null || color.isBlank() || color.isEmpty()) {
            System.err.println("Invalid color");
            System.exit(1);
        }

            this.color = color;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(!(gender=='M' || gender=='F')){
            System.out.println("Invalid Gender");
            System.exit(1);
        }
        this.gender = gender;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            System.err.println("Invalid Age");
            System.exit(1);
        }
        this.age = age;
    }

    public void eat(){
        System.out.println(name + " is eating");
    }
    public void drink(){
        System.out.println(name + " is drinking");
    }
    public void sleep(){
        System.out.println(name + " is sleeping");
    }
    public void move(){
        System.out.println(name + " is moving");
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", size=" + size +
                ", age=" + age +
                '}';
    }
}
