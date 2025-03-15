package sg.edu.ntu.chapterFive.fiveOne.solutionLikeComposition;

public class TestLine {
    public static void main(String[] args) {
        Line l1 = new Line(0, 0, 3, 4);
        System.out.println(l1);

        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Line l2 = new Line(p1, p2);
        System.out.println(l2);

        l1.setBegin(p1);
        l1.setEnd(p2);
        System.out.println(l1);
        System.out.println("begin is: " + l1.getBegin());
        System.out.println("end is: " + l1.getEnd());
        System.out.println("begin x is: " + l1.getBeginX());
        System.out.println("begin y is: " + l1.getBeginY());
        System.out.println("end x is: " + l1.getEndX());
        System.out.println("end y is: " + l1.getEndY());

        l1.setBeginX(11);
        l1.setBeginY(12);
        l1.setEndX(13);
        l1.setEndY(14);
        System.out.println(l1);
        System.out.println("begin is: " + l1.getBegin());
        System.out.println("end is: " + l1.getEnd());
        System.out.println("begin x is: " + l1.getBeginX());
        System.out.println("begin y is: " + l1.getBeginY());
        System.out.println("end x is: " + l1.getEndX());
        System.out.println("end y is: " + l1.getEndY());

    }
}
