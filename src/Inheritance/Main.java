package Inheritance;

public class Main {
    public static void main(String[] args) {
//        This is creating a new animal for a base animal
        Animal animal = new Animal ("Animal", 1,1,5,5);
//        this creates a new dog
        Dog dog = new Dog("Terrier", 8, 20, 2, 4, 2,20, "Short and White");
//        we can use the method here because the method .eat was defined in the animal class
        dog.eat();
        dog.walk();
        dog.run();


    }
}
