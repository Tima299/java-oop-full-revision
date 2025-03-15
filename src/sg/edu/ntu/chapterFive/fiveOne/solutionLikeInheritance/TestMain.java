package sg.edu.ntu.chapterFive.fiveOne.solutionLikeInheritance;

public class TestMain {
    public static void main(String[] args) {
        Point p1 = new Point(10, 20);   // Construct a Point
        System.out.println(p1);
        // Try setting p1 to (100, 10).
        p1.setXY(100, 10);
        System.out.println(p1);
        // Try setting p1's x and y to 100 and 200 respectively.
        p1.setX(100);
        p1.setY(200);
        System.out.println(p1);
        System.out.println("x is: " + p1.getX());
        System.out.println("y is: " + p1.getY());

        // Test Point's methods
        Point p2 = new Point(1, 2);   // Construct a Point
        System.out.println(p2);  // toString()
        System.out.println("x is: " + p2.getX());
        System.out.println("y is: " + p2.getY());
        p2.setXY(3, 4);
        System.out.println(p2);  // toString()
        System.out.println("x is: " + p2.getX());
        System.out.println("y is: " + p2.getY());

        LineSub l1 = new LineSub(0, 0, 3, 4);
        System.out.println(l1);
        LineSub l2 = new LineSub(new Point(1, 2), new Point(3, 4));
        System.out.println(l2);
        System.out.println("begin is: " + l2.getBegin());
        System.out.println("end is: " + l2.getEnd());
        l2.setBegin(new Point(5, 6));
        l2.setEnd(new Point(7, 8));
        System.out.println(l2);

        System.out.println("begin's x is: " + l2.getBeginX());
        System.out.println("begin's y is: " + l2.getBeginY());
        System.out.println("end's x is: " + l2.getEndX());
        System.out.println("end's y is: " + l2.getEndY());
        l2.setBeginX(9);
        l2.setBeginY(10);
        l2.setEndX(11);
        l2.setEndY(12);
        System.out.println(l2);

        System.out.println("begin's x is: " + l2.getBegin().getX());
        System.out.println("begin's y is: " + l2.getBegin().getY());
        System.out.println("end's x is: " + l2.getEnd().getX());
        System.out.println("end's y is: " + l2.getEnd().getY());

        System.out.println("begin's x is: " + l2.getBegin().getX());
        System.out.println("begin's y is: " + l2.getBegin().getY());
        System.out.println("end's x is: " + l2.getEnd().getX());
        System.out.println("end's y is: " + l2.getEnd().getY());
    }
}
