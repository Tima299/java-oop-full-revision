package sg.edu.ntu.chapterSix.sixOne;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(){
        this(1.0, 1.0);
    }
    public Rectangle(double width, double length){
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return this.width * this.length;
    }
    public double getPerimeter(){
        return 2 * (this.width + this.length);
    }
    public String toString(){
        return "Rectangle[" + super.toString() + ", width=" + this.width + ", length=" + this.length + "]";
    }
}
