package liang_problem_book.problem_10_11;

public class Circle2D {
    /*(Geometry: the Circle2D class) Define the Circle2D class that contains:
■■ Two double data fields named x and y that specify the center of the circle
with getter methods.
■■ A data field radius with a getter method.
■■ A no-arg constructor that creates a default circle with (0, 0) for (x, y) and 1
for radius.
■■ A constructor that creates a circle with the specified x, y, and radius.
■■ A method getArea() that returns the area of the circle.
■■ A method getPerimeter() that returns the perimeter of the circle.
■■ A method contains(double x, double y) that returns true if the
specified point (x, y) is inside this circle (see Figure 10.21a).
■■ A method contains(Circle2D circle) that returns true if the specified
circle is inside this circle (see Figure 10.21b).
■■ A method overlaps(Circle2D circle) that returns true if the specified
circle overlaps with this circle (see Figure 10.21c).*/

private double x;
private double y;
private int radius;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }
    public Circle2D(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public Circle2D() {
        this(0, 0, 1);
    }
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    public boolean contains(double x, double y) {
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2)) < radius;
    }
    public boolean contains(Circle2D circle) {
        return Math.sqrt(Math.pow(circle.x - this.x, 2) + Math.pow(circle.y - this.y, 2)) + circle.radius < this.radius;
    }
    public boolean overlaps(Circle2D circle) {
        return Math.sqrt(Math.pow(circle.x - this.x, 2) + Math.pow(circle.y - this.y, 2)) < circle.radius + this.radius;
    }
}
