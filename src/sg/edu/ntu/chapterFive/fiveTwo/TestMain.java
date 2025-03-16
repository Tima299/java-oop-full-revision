package sg.edu.ntu.chapterFive.fiveTwo;

import sg.edu.ntu.chapterFour.fourOne.Cylinder;

import javax.imageio.stream.ImageInputStream;

public class TestMain{
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(1.0, 1.0);
        System.out.println("Radius is " + cylinder.getRadius());
        System.out.println("Height is " + cylinder.getHeight());
        System.out.println("Color is " + cylinder.getColor());
        System.out.println("Base area is " + cylinder.getArea());
        System.out.println("Volume is " + cylinder.getVolume());
        System.out.println("Cylinder is " + cylinder.toString());

        cylinder.setRadius(2.0);
        cylinder.setHeight(2.0);
        cylinder.setColor("blue");
        System.out.println("Radius is " + cylinder.getRadius());
        System.out.println("Height is " + cylinder.getHeight());
        System.out.println("Color is " + cylinder.getColor());
        System.out.println("Base area is " + cylinder.getArea());
        System.out.println("Volume is " + cylinder.getVolume());
        System.out.println("Cylinder is " + cylinder.toString());

        Cylinder cylinder1 = new Cylinder();
        System.out.println("Radius is " + cylinder1.getRadius());
        System.out.println("Height is " + cylinder1.getHeight());
        System.out.println("Color is " + cylinder1.getColor());
        System.out.println("Base area is " + cylinder1.getArea());
        System.out.println("Volume is " + cylinder1.getVolume());
        System.out.println("Cylinder is " + cylinder1.toString());

        Cylinder cylinder2 = new Cylinder(2.0);
        System.out.println("Radius is " + cylinder2.getRadius());
        System.out.println("Height is " + cylinder2.getHeight());
        System.out.println("Color is " + cylinder2.getColor());
        System.out.println("Base area is " + cylinder2.getArea());
        System.out.println("Volume is " + cylinder2.getVolume());
        System.out.println("Cylinder is " + cylinder2.toString());

        Cylinder cylinder3 = new Cylinder(2.0, 2.0);
        System.out.println("Radius is " + cylinder3.getRadius());
        System.out.println("Height is " + cylinder3.getHeight());
        System.out.println("Color is " + cylinder3.getColor());
        System.out.println("Base area is " + cylinder3.getArea());
        System.out.println("Volume is " + cylinder3.getVolume());
        System.out.println("Cylinder is " + cylinder3.toString());

        Cylinder cylinder4 = new Cylinder(2.0, 2.0, "green");
        System.out.println("Radius is " + cylinder4.getRadius());
        System.out.println("Height is " + cylinder4.getHeight());
        System.out.println("Color is " + cylinder4.getColor());
        System.out.println("Base area is " + cylinder4.getArea());
        System.out.println("Volume is " + cylinder4.getVolume());
        System.out.println("Cylinder is " + cylinder4.toString());
    }
}