package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape;

        myShape =new Rectangle(10,5);
        System.out.println("Rectangle area = " + myShape.getArea() + "\n");
        System.out.println("Rectangle perimeter = " + myShape.getPerimeter() + "\n");
        System.out.println("******");

        myShape = new Square(5);
        System.out.println("Square area = " + myShape.getArea() + "\n");
        System.out.println("Square perimeter = " + myShape.getPerimeter() + "\n");
        /* --Commented out for Interface and Abstract Exercises
        Rectangle box1 = new Rectangle(5, 4);
        Rectangle box2 = new Square(5);
        System.out.printf("Box 1 has:\n\tan area of %.2g and\n\ta perimeter of %.2g\n", box1.getArea(), box1.getPerimeter());
        System.out.printf("Box 2 has:\n\tan area of %.2g and\n\ta perimeter of %.2g",box2.getArea(), box2.getPerimeter() );
        */
    }
}


//package shapes;
//
//public class ShapesTest {
//    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(5,4);
//        System.out.println("The Rectangle's Area " + box1.getArea());
//        System.out.println("The Rectangle's Perimeter  " + box1.getPerimeter());
//
//        Rectangle box2 = new Square(5);
//        System.out.println("The Square's Area  " + box2.getArea());
//        System.out.println("The Square's Perimeter  " + box2.getPerimeter());
//
//
//    }
//}
