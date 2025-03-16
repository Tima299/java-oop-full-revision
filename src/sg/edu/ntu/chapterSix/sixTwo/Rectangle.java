package sg.edu.ntu.chapterSix.sixTwo;

public class Rectangle implements GeometricObject{
    public double width;
    public double length;
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public String toString(){
        return "Rectangle[width = " + width + ", length = " + length + "]";
    }
    public double getArea(){
        return this.width * this.length;
    }
    public double getPerimeter(){
        return 2 * (this.width * this.length);
    }
}
