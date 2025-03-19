package liang_problem_book.problem_10_11;

public class TestMain {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 11);
        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());
        System.out.println("c1.contains(3, 3): " + c1.contains(3, 3));
        System.out.println("c1.contains(new Circle2D(4, 5, 10.5)): " + c1.contains(new Circle2D(4, 5, 10)));
        System.out.println("c1.overlaps(new Circle2D(3, 5, 2.3)): " + c1.overlaps(new Circle2D(3, 5, 2)));

        Circle2D c2 = new Circle2D(4, 5, 5);

        System.out.println("Area: " + c2.getArea());

        System.out.println("Perimeter: " + c2.getPerimeter());

        System.out.println("c2.contains(3, 3): " + c2.contains(3, 3));

        System.out.println("c2.contains(new Circle2D(4, 5, 10.5)): " + c2.contains(new Circle2D(4, 5, 10)));

        System.out.println("c2.overlaps(new Circle2D(3, 5, 2.3)): " + c2.overlaps(new Circle2D(3, 5, 2)));

        System.out.println("c1.contains(c2): " + c1.contains(c2));

        System.out.println("c1.overlaps(c2): " + c1.overlaps(c2));

        System.out.println("c2.contains(c1): " + c2.contains(c1));

        System.out.println("c2.overlaps(c1): " + c2.overlaps(c1));
    }
}
