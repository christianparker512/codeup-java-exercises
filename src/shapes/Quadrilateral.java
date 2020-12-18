package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{
//properties
    protected double length;
    protected double width;

//    Constructors
    public Quadrilateral(double aLength, double aWidth){
        this.length = aLength;
        this.width = aWidth;
    }
//Getters and Setters
    public abstract void setLength(double aLength);

    public abstract void setWidth(double aWidth);

    public double getLength(){
        return this.length;
    }

    public double getWidth(){
        return this.width;
    };

}