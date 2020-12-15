package shapes;

public class Square extends Rectangle{
    private double sides;
    public Square (double side){
        super(side, side);
        sides = side;
    }
    public double getArea(){
        System.out.println("This is a a square. Get the area!");
        return (int) Math.pow(sides,2);
//        return length * length;
    }
    public double getPerimeter(){
        System.out.println("This is a square. Get the perimeter!");
        return sides * 4;
    }

}
