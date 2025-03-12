package sg.edu.ntu.chapterFour.fourFour;

public class TestMain {
    public static void main(String[] args) {
        MovablePoint mp = new MovablePoint(1.0f, 2.0f, 3.0f, 4.0f);
        System.out.println(mp);
        mp.move();
        System.out.println(mp);

        MovablePoint mp2 = new MovablePoint();
        System.out.println(mp2);
        mp2.move();
        System.out.println(mp2);

        MovablePoint mp3 = new MovablePoint(5.0f, 6.0f);
        System.out.println(mp3);
        mp3.move();
        System.out.println(mp3);

    }
}
