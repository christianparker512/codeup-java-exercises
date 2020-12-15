package Inherit;

public class Main {
    public static void main(String[] args) {
        Mouse1 m1 = new Mouse1();
        Mouse2 m2 = new Mouse2();
        m1.leftClick();
        m2.rightClick();
        m2.scrollDown();
        m2.scrollDown();

    }
}
