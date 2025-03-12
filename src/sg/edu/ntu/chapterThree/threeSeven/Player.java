package sg.edu.ntu.chapterThree.threeSeven;

public class Player {
    private int number;
    private float x;
    private float y;
    private float z = 0.0f;

    public Player(int number, float x, float y, float z) {
        this.number = number;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void move(float xDisp, float yDisp) {
        x += xDisp;
        y += yDisp;
    }

    public void jump(float zDisp) {
        z += zDisp;
    }

    public Boolean near(Ball ball) {
        float xDiff = x - ball.getX();
        float yDiff = y - ball.getY();
        float zDiff = z - ball.getZ();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff + zDiff * zDiff) < 1.0;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }

    public void kick(Ball ball) {
        ball.setXYZ(x, y, z);
    }
}
