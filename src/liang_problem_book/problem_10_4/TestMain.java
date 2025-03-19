package liang_problem_book.problem_10_4;

public class TestMain {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(10, 30.5);
        System.out.println("Distance between p1 and p2 is " + p1.distance(p2));

        System.out.println("Distance between p1 and (10, 30.5) is " + p1.distance(10, 30.5));

        System.out.println("Distance between p2 and (0, 0) is " + p2.distance(0, 0));

        System.out.println("Distance between p1 and p2 is " + p1.distance(p2));

        System.out.println("Distance between p1 and (10, 30.5) is " + p1.distance(10, 30.5));

        System.out.println("Distance between p2 and (0, 0) is " + p2.distance(0, 0));

        System.out.println("Distance between p2 and (0, 0) is " + p2.distance(0, 0));

        System.out.println("Distance between p1 and p2 is " + p1.distance(p2));

        System.out.println("Distance between p1 and (10, 30.5) is " + p1.distance(10, 30.5));

        System.out.println("Distance between p2 and (0, 0) is " + p2.distance(0, 0));
    }
}
