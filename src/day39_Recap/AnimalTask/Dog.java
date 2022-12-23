package day39_Recap.AnimalTask;

public class Dog extends FriendlyAnimal {


    public Dog(String name, String breed, String color, char gender, char size, int age, boolean isFriendly, boolean isWild, boolean isPlayable) {
        super(name, breed, color, gender, size, age, isFriendly, isWild, isPlayable);
    }

    @Override
    public void eat() {
        System.out.println(getGender() + " " + getName() + " is barking");
    }



}
