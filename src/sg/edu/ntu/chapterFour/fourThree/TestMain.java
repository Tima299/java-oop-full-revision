package sg.edu.ntu.chapterFour.fourThree;

import constructors.nineTwo.Main;

public class TestMain {
    public static void main(String[] args) {
        Point3D point3D = new Point3D(1.0f, 2.0f, 3.0f);
        System.out.println(point3D);
        point3D.setXYZ(4.0f, 5.0f, 6.0f);
        System.out.println(point3D);

        Point2D point2D = new Point2D(7.0f, 8.0f);
        System.out.println(point2D);
        point2D.setXY(9.0f, 10.0f);
        System.out.println(point2D);

    }
}
