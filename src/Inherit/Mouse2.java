package Inherit;

public class Mouse2 extends Mouse{
    String texture = "Matte";
    public static void leftClick(){
        System.out.println("Click!");
    }
    public static void rightClick(){
        System.out.println("click!");
    }
    public static void connect(){
        System.out.println("connected");
    }
    public static void scrollUp() {
        System.out.println("Scrolled up!");
    }
}

