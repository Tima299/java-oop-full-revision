package sg.edu.ntu.chapterSix.sixThree;

public class TestMain {
    public static void main(String[] args) {
        System.out.println("- ".repeat(15));
        Movable m1 = new MovablePoint(5, 6, 10, 15); // upcast
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
        System.out.println("- ".repeat(15));
        Movable m2 = new MovablePoint(2, 1, 2, 20); // upcast
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);
        System.out.println("- ".repeat(15));
        Movable m3 = new MovablePoint(3, 4, 5, 6); // upcast
        System.out.println(m3);
        m3.moveUp();
        System.out.println(m3);
        System.out.println("- ".repeat(15));
        Movable m4 = new MovablePoint(1, 2, 3, 4); // upcast
        System.out.println(m4);
        m4.moveDown();
        System.out.println(m4);
        System.out.println("- ".repeat(15));
    }
}
