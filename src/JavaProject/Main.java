package JavaProject;

public class Main {
    public static void main(String[] args) {
        Class1 c = new Class1();
        Class1 d = new Class1();
        Class2 e = new Class2();
        System.out.println(c);
        System.out.println(d);
        c.printHi();
        System.out.println(e.y);
        System.out.println(c.x);
        System.out.println(d.z);
    }

}
