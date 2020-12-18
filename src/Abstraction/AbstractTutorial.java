package Abstraction;


abstract class Dog {
//    String breed;
    public void bark() {
        System.out.println("bark!");
    }
    public abstract void poop();
}

class Terrier extends Dog  {
    public void poop () {
        System.out.println("Dog pooped!");
    }

}
public class AbstractTutorial {
    public static void main(String[] args) {
        Terrier d = new Terrier();
        d.bark();
        d.poop();


    }
}
