package sg.edu.ntu.chapterTwo.twoNine;

public class TestMain {
    public static void main(String[] args) {
        // Create MyPoint instances
        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(3, 0);
        MyPoint p3 = new MyPoint(0, 4);

        // Create MyTriangle instances using both constructors
        MyTriangle t1 = new MyTriangle(0, 0, 3, 0, 0, 4);
        MyTriangle t2 = new MyTriangle(p1, p2, p3);

        // Print MyPoint instances
        System.out.println("Points:");
        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
        System.out.println("p3 = " + p3);
        System.out.println();

        // Test MyTriangle instance created using coordinates
        System.out.println("Triangle t1:");
        System.out.println(t1);
        System.out.println("Perimeter: " + t1.getPerimeter());
        System.out.println("Type: " + t1.getType());
        System.out.println();

        // Test MyTriangle instance created using MyPoint objects
        System.out.println("Triangle t2:");
        System.out.println(t2);
        System.out.println("Perimeter: " + t2.getPerimeter());
        System.out.println("Type: " + t2.getType());
    }
}
