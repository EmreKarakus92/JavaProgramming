package day36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.setInfo("Lucky", "Golden", 'M', 'M', 5, "Yellow");
        System.out.println(dog1);

        dog1.eat();
        dog1.bark();

        Cat cat1 = new Cat();
        cat1.setInfo("Mocha", "British", 'M', 'S', 3, "Yellow" );
        System.out.println("cat1 = " + cat1);

        cat1.meow();
        cat1.scratch();

        Tiger tiger1 = new Tiger();
        tiger1.setInfo("Simba", "Nepal", 'F', 'L', 5, "Orange");
        System.out.println("tiger1 = " + tiger1);

        tiger1.hunt();
        tiger1.roar();


    }
}
