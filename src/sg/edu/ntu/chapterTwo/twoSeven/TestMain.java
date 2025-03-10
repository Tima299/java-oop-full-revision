package sg.edu.ntu.chapterTwo.twoSeven;

public class TestMain {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(3, 0);
        MyPoint p2 = new MyPoint(0, 4);
        System.out.println(p1.distance(p2));
        System.out.println(p1.distance(5, 6));
        System.out.println(p1.distance());
        MyLine l1 = new MyLine(0, 0, 3, 4);
        System.out.println(l1.getLength());
        System.out.println(l1.getGradient());
        System.out.println(l1);

        MyPoint p3 = new MyPoint(1, 1);
        MyPoint p4 = new MyPoint(2, 2);

        MyLine l2 = new MyLine(p3, p4);
        System.out.println(l2.getLength());
        System.out.println(l2.getGradient());
        System.out.println(l2);

    }
}
