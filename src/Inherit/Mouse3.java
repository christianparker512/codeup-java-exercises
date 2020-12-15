package Inherit;

public class Mouse3 extends Mouse{
    boolean ambidextrous = true;

    String texture = "Matte";
    public static void leftClick(){
        System.out.println("Click!");
    }
    public static void rightClick(){
        System.out.println("click!");
    }
    public static void scrollUp() {
        System.out.println("Scrolled up!");
    }
}
