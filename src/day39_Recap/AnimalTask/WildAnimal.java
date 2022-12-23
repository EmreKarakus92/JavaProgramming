package day39_Recap.AnimalTask;

public class WildAnimal extends Animal {

    boolean isWild, isFriendly, isPlayable ;

    public WildAnimal(String name, String breed, String color, char gender, char size, int age) {
        super(name, breed, color, gender, size, age);
    }

    public void hunt(){
        System.out.println(getName() + " is hunting");
    }


}
