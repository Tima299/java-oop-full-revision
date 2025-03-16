package sg.edu.ntu.chapterSix.sixFour;

public class TestMain {
    public static void main(String[] args) {
        // Test MovablePoint
        MovablePoint p1 = new MovablePoint(1, 2, 3, 4);
        System.out.println(p1);
        p1.moveLeft();
        System.out.println(p1);
        p1.moveDown();
        System.out.println(p1);
        // Test MovableCircle
        MovableCircle c1 = new MovableCircle(1, 2, 3, 4, 20);
        System.out.println(c1);
        c1.moveRight();
        System.out.println(c1);
        c1.moveUp();
        System.out.println(c1);
    }
}
