package day39_Recap.AnimalTask;

public class FriendlyAnimal extends Animal {

    public boolean isFriendly, isWild, isPlayable ;

    public FriendlyAnimal(String name, String breed, String color, char gender, char size, int age, boolean isFriendly, boolean isWild, boolean isPlayable) {
        super(name, breed, color, gender, size, age);
        this.isFriendly = isFriendly;
        this.isWild = isWild;
        this.isPlayable = isPlayable;
    }

    public void play(){
        System.out.println(getName() + " is playing");
    }

    public void pet(){
        System.out.println( getName() + " is a pet");
    }

}
