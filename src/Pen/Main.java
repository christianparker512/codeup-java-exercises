package Pen;

public class Main {
    public static void main(String[] args) {
        Pen p = new Pen ();
        System.out.println(p.color);
        System.out.println(p.point);
        System.out.println(p.type);

        p.click();

        System.out.println("clicked");

    }
}
