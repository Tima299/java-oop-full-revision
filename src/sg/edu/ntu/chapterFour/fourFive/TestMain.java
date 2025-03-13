package sg.edu.ntu.chapterFour.fourFive;

public class TestMain {
    public static void main(String[] args) {
        Shape shape = new Shape("red", true);
        System.out.println(shape);
        Circle circle = new Circle(2.0, "blue", false);
        System.out.println(circle);
        Rectangle rectangle = new Rectangle(2.0, 3.0, "yellow", true);
        System.out.println(rectangle);
        Square square = new Square(4.0, "black", false);
        System.out.println(square);

        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle perimeter: " + circle.getPerimeter());
        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
        System.out.println("Square area: " + square.getArea());
        System.out.println("Square perimeter: " + square.getPerimeter());

        System.out.println("Circle radius: " + circle.getRadius());
        System.out.println("Rectangle width: " + rectangle.getWidth());
        System.out.println("Rectangle length: " + rectangle.getLength());
        System.out.println("Square side: " + square.getSide());

        circle.setRadius(3.0);
        rectangle.setWidth(4.0);
        rectangle.setLength(5.0);
        square.setSide(6.0);

        System.out.println("Circle radius: " + circle.getRadius());
        System.out.println("Rectangle width: " + rectangle.getWidth());
        System.out.println("Rectangle length: " + rectangle.getLength());
        System.out.println("Square side: " + square.getSide());

        circle.setColor("purple");
        rectangle.setColor("orange");
        square.setColor("pink");

        System.out.println("Circle color: " + circle.getColor());
        System.out.println("Rectangle color: " + rectangle.getColor());
        System.out.println("Square color: " + square.getColor());

        circle.setFilled(true);
        rectangle.setFilled(false);
        square.setFilled(true);

        System.out.println("Circle filled: " + circle.isFilled());
        System.out.println("Rectangle filled: " + rectangle.isFilled());
        System.out.println("Square filled: " + square.isFilled());

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);

        Shape shape1 = new Circle(5.0, "brown", true);
        System.out.println(shape1);
        Shape shape2 = new Rectangle(6.0, 7.0, "grey", false);
        System.out.println(shape2);
        Shape shape3 = new Square(8.0, "white", true);
        System.out.println(shape3);

    }
}
