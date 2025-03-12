
package sg.edu.ntu.chapterThree.threeSix;
public class TestMain {
    public static void main(String[] args) {
        Container container = new Container(0, 0, 100, 100);
        Ball ball = new Ball(50, 50, 5, 2, 3);

        System.out.println("Initial Ball State: " + ball);

        for (int i = 0; i < 20; i++) {
            ball.move();
            if (!container.collidesWith(ball)) {
                ball.reflectHorizontal();
                ball.reflectVertical();
            }
            System.out.println("After move " + (i + 1) + ": " + ball);
        }
    }
}
