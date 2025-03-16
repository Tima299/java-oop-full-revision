package sg.edu.ntu.chapterSeven.sevenTwo;

public class Point {
    private int x;
    private int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY() {
        return new int[] { x, y };
    }
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "(" + x + "," + y + ")";
    }
    public double distance(Point another) {
        int xDiff = x - another.x;
        int yDiff = y - another.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
}