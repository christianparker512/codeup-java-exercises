package shapes;

public class Square extends Rectangle{
    private int sides;
    public Square (int side){
        super(side, side);
        sides = side;
    }
    public int getArea(){
        System.out.println("This is a a square. Get the area!");
        return (int) Math.pow(sides,2);
    }
    public int getPerimeter(){
        System.out.println("This is a square. Get the perimeter!");
        return sides * 4;
    }

}
