package sg.edu.ntu.chapterTwo.twoSix;

public class TestMain {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(3, 0);
        MyPoint p2 = new MyPoint(0, 4);
        System.out.println(p1.distance(p2));
        System.out.println(p1.distance(5, 6));
        System.out.println(p1.distance());

        MyPoint p3 = new MyPoint();
        System.out.println(p3);
        p3.setXY(8, 6);
        System.out.println(p3);

        MyPoint p4 = new MyPoint(1, 1);
        System.out.println(p4);
        p4.setX(2);
        p4.setY(2);
        System.out.println(p4);

    }
}
