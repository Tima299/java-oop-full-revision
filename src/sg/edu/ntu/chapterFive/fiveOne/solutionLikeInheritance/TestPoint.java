package sg.edu.ntu.chapterFive.fiveOne.solutionLikeInheritance;

import sg.edu.ntu.chapterFive.fiveOne.solutionLikeComposition.Point;

public class TestPoint {
    public static void main(String[] args) {
        sg.edu.ntu.chapterFive.fiveOne.solutionLikeComposition.Point p1 = new sg.edu.ntu.chapterFive.fiveOne.solutionLikeComposition.Point(10, 20);   // Construct a Point
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
        sg.edu.ntu.chapterFive.fiveOne.solutionLikeComposition.Point p2 = new Point(1, 2);   // Construct a Point
        System.out.println(p2);  // toString()
        System.out.println("x is: " + p2.getX());
        System.out.println("y is: " + p2.getY());
        p2.setXY(3, 4);
        System.out.println(p2);  // toString()
        System.out.println("x is: " + p2.getX());
        System.out.println("y is: " + p2.getY());
    }
}
