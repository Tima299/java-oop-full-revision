package sg.edu.ntu.chapterTwo.twoTen;

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    @Override
    public String toString() {
        return "MyRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }

    public double getWidth() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    public double getHeight() {
        return Math.abs(topLeft.getY() - bottomRight.getY());
    }

    public double getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    public double getArea() {
        return getWidth() * getHeight();
    }
}
