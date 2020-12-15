package Inherit;

public class Mouse1 extends Mouse{
    String texture = "Matte";
    public static void leftClick(){
        System.out.println("Click!");
    }
    public static void rightClick(){
        System.out.println("click!");
    }
    public static void setColor(String color){
        System.out.println(color);
    }
    public static void scrollUp() {
        System.out.println("Scrolled up!");
    }
}
