package shapes;

public class Square extends Quadrilateral {
    public Square(double aSide){
        super(aSide,aSide);
    }

    public void setSide(double aSide){
        this.length = aSide;
        this.width = aSide;
    }

    @Override
    public void setLength(double aSide) {
        this.setSide(aSide);
    }

    @Override
    public void setWidth(double aSide) {
        this.setSide(aSide);
    }

    @Override
    public double getPerimeter() {
        return this.length * 4;
    }

    @Override
    public double getArea() {
        return Math.pow(this.length, 2);
    }

    /* --Original code before Interface and Abstract Lesson
        public Square(double aSide) {
            super(aSide, aSide);
        }
        public double getSide(){
            return this.length;
        }
        public double getArea(){
            return Math.pow(this.getSide(),2);
        }
        public double getPerimeter(){
            return this.getSide()*4;
    }
    */

}

//package shapes;
//
//public class Square extends Rectangle{
//    private double sides;
//    public Square (double side){
//        super(side, side);
//        sides = side;
//    }
//    public double getArea(){
//        System.out.println("This is a a square. Get the area!");
//        return (int) Math.pow(sides,2);
////        return length * length;
//    }
//    public double getPerimeter(){
//        System.out.println("This is a square. Get the perimeter!");
//        return sides * 4;
//    }
//
//}
