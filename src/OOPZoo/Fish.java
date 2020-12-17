package OOPZoo;

public class Fish extends Animal {
    public Fish(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
    }
    @Override public void move() {
        System.out.println("moving my fins");
    }
    public void swim() {
        System.out.println("Swimming");
    }

}
