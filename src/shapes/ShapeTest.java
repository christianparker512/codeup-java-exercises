package shapes;

public class ShapeTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(3,4);
        System.out.println("The Rectangle's Area " + box1.getArea());
        System.out.println("The Rectangle's Perimeter  " + box1.getPerimeter());

        Rectangle box2 = new Square(2);
        System.out.println("The Square's Area  " + box2.getArea());
        System.out.println("The Square's Perimeter  " + box2.getPerimeter());


    }
}
