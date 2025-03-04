package constructors.nineOne;

public class Rectangle {
    public double width;
    public double height;
    public Rectangle() {
        System.out.println("No args constructor is called");
    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea(double width, double height) {
        return (width * height);
    }
    public double getPerimeter(double width, double height) {
        return 2 * (height + width);
    }
}
