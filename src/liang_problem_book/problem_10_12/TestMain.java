package liang_problem_book.problem_10_12;

import java.util.Arrays;

public class TestMain {
    public static void main(String[] args) {
        Triangle2D t1 = new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3), new MyPoint(5, 3.5));
        System.out.println("Area: " + t1.getArea());
        System.out.println("Perimeter: " + t1.getPerimeter());
        System.out.println("Contains (3, 3): " + t1.contains(new MyPoint(3, 3)));
        for (String s : Arrays.asList("Contains new Triangle2D(2.9, 2, 4, 1, 1.5, 5.5): " + t1.contains(new Triangle2D(new MyPoint(2.9, 2),
                new MyPoint(4, 1), new MyPoint(5, 5))), "Overlaps new Triangle2D(3, 2.9, 2, 4, 1, 1.5, 5.5): " + t1.overlaps(new Triangle2D
                (new MyPoint(3, 2.9), new MyPoint(2, 4), new MyPoint(1, 1.5))))) {
            System.out.println(s);
        }

        Triangle2D t2 = new Triangle2D(new MyPoint(1, 1), new MyPoint(2, 2), new MyPoint(3, 3));
        System.out.println("Area: " + t2.getArea());


        Triangle2D t3 = new Triangle2D(new MyPoint(1, 1), new MyPoint(2, 2), new MyPoint(3, 3));
        System.out.println("Area: " + t3.getArea());

        Triangle2D t4 = new Triangle2D(new MyPoint(1, 1), new MyPoint(2, 2), new MyPoint(3, 3));

        for (String s : Arrays.asList("Contains new Triangle2D(1, 1, 2.5, 2.5, 3, 3): " + t4.contains(new Triangle2D(new MyPoint(1, 1),
                        new MyPoint(2.5, 2.5), new MyPoint(3, 3))), "Overlaps new Triangle2D(1, 1, 2.5, 2.5, 3, 3): " + t4.overlaps(
                        new Triangle2D(new MyPoint(1, 1), new MyPoint(2.5, 2.5), new MyPoint(3, 3))),
                "Contains new Triangle2D(4, 5, 10.5, 3.2, -0.5, -10.5): " + t4.contains(new Triangle2D(new MyPoint(4, 5),
                        new MyPoint(10.5, 3.2), new MyPoint(-0.5, -10.5))), "Overlaps new Triangle2D(4, 5, 10.5, 3.2, -0.5, -10.5): " +
                        t4.overlaps(new Triangle2D(new MyPoint(4, 5), new MyPoint(10.5, 3.2), new MyPoint(-0.5, -10.5))),
                "Contains new Triangle2D(3, 2.9, 2, 4, 1, 1.5): " + t4.contains(new Triangle2D(new MyPoint(3, 2.9),
                        new MyPoint(2, 4), new MyPoint(1, 1.5))))) {
            System.out.println(s);
        }

    }
}
