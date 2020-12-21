package Poly;

class Bird {
    public void sing (){
        System.out.println("tweet tweet tweet");
    }
}

class Robin extends Bird {
    public void sing(){
        System.out.println("twiddledeedee");
    }
}
class Pelican extends Bird{
    public void sing(){
        System.out.println("Kwaah Kwaaah Kwaah");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Robin b = new Robin();
        Pelican c = new Pelican();

        b.sing();
        c.sing();
    }
}
