package sg.edu.ntu.chapterTwo.twoEight;

public class TestMain {
    public static void main(String[] args) {
        // Creating MyPoint instances
        MyPoint p1 = new MyPoint(3, 4);
        MyPoint p2 = new MyPoint(6, 8);

        // Testing MyPoint methods
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println("Distance between p1 and p2: " + p1.distance(p2));
        System.out.println("Distance from p1 to (0,0): " + p1.distance());
        System.out.println("Distance from p1 to (7,1): " + p1.distance(7, 1));

        // Creating MyCircle instances
        MyCircle c1 = new MyCircle(); // Default constructor
        MyCircle c2 = new MyCircle(2, 3, 5);
        MyCircle c3 = new MyCircle(p1, 7);

        // Testing MyCircle methods
        System.out.println("\n--- MyCircle Tests ---");
        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println("c3: " + c3);

        // Getting and setting radius
        System.out.println("c2 radius: " + c2.getRadius());
        c2.setRadius(10);
        System.out.println("Updated c2 radius: " + c2.getRadius());

        // Getting and setting center
        System.out.println("c3 center: " + c3.getCenter());
        c3.setCenter(new MyPoint(10, 10));
        System.out.println("Updated c3 center: " + c3.getCenter());

        // Getting and setting individual x and y coordinates of center
        System.out.println("c2 center X: " + c2.getCenterX());
        System.out.println("c2 center Y: " + c2.getCenterY());
        c2.setCenterX(8);
        c2.setCenterY(9);
        System.out.println("Updated c2 center: " + c2.getCenter());

        // Getting and setting center as an array
        int[] centerXY = c2.getCenterXY();
        System.out.println("c2 centerXY: (" + centerXY[0] + ", " + centerXY[1] + ")");
        c2.setCenterXY(15, 20);
        System.out.println("Updated c2 centerXY: " + c2.getCenter());

        // Calculating area and circumference
        System.out.println("c3 area: " + c3.getArea());
        System.out.println("c3 circumference: " + c3.getCircumference());

        // Distance between two circles
        System.out.println("Distance between centers of c2 and c3: " + c2.distance(c3));
    }
}