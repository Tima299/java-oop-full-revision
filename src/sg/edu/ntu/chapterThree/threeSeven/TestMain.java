package sg.edu.ntu.chapterThree.threeSeven;

public class TestMain {
    public static void main(String[] args) {
        Player player = new Player(1, 1.2f, 2.7f, 3.8f);
        Ball ball = new Ball(12.2f, 23.3f, 34.5f);

        System.out.println("Initial Ball Position: " + ball);
        System.out.println("Initial Player Position: (" + player.getX() + ", " + player.getY() + ", " + player.getZ() + ")");

        System.out.println("\nChecking proximity...");
        System.out.println("Player is near the ball: " + player.near(ball));

        System.out.println("\nPlayer moves...");
        player.move(1.0f, 1.0f);

        System.out.println("Player is near the ball: " + player.near(ball));
        System.out.println("New Player Position: (" + player.getX() + ", " + player.getY() + ", " + player.getZ() + ")");

        System.out.println("\nPlayer jumps...");
        player.jump(1.0f);

        System.out.println("Player is near the ball: " + player.near(ball));
        System.out.println("New Player Position: (" + player.getX() + ", " + player.getY() + ", " + player.getZ() + ")");

        System.out.println("\nPlayer kicks the ball...");
        player.kick(ball);
        System.out.println("New Ball Position: " + ball);
        System.out.println("Player is near the ball: " + player.near(ball));
    }
}
