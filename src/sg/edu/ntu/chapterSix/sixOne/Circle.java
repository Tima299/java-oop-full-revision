package sg.edu.ntu.chapterSix.sixOne;

public class Circle extends Shape{
    protected double radius;
    public Circle(){
        this(1.0);
    }
    public Circle(double radius){
        super();
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }
    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }
    public String toString(){
        return "Circle[" + super.toString() + ", radius=" + this.radius + "]";
    }
}
