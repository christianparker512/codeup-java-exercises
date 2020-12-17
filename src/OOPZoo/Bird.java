package OOPZoo;

public class Bird extends Animal {

    public Bird(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
    }
    @Override
    public void move() {
        System.out.println("Flapping my wings");
    }
    public void fly(){
        System.out.println("Flying...");
    }
    public void eat(){
        System.out.println("Flying...");
    }
}
