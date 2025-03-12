package sg.edu.ntu.chapterTwo.twoTen;

public class TestMain {
    public static void main(String[] args) {
        MyPoint topLeft = new MyPoint(1, 5);
        MyPoint bottomRight = new MyPoint(4, 1);

        MyRectangle myRectangle = new MyRectangle(topLeft, bottomRight);

        System.out.println(myRectangle);
        System.out.println("Width: " + myRectangle.getWidth());
        System.out.println("Height: " + myRectangle.getHeight());
        System.out.println("Perimeter: " + myRectangle.getPerimeter());
        System.out.println("Area: " + myRectangle.getArea());
    }
}
