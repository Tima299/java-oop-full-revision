package sg.edu.ntu.chapterSix.sixFive;

public class TestMain {
    public static void main(String[] args) {
        GeometricObject circle = new Circle(5);
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
        Resizable resizableCircle = new ResizableCircle(5);
        System.out.println(resizableCircle);
        resizableCircle.resize(50);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
    }
}
