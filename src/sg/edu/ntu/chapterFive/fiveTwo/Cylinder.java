package sg.edu.ntu.chapterFive.fiveTwo;

public class Cylinder{
    private Circle base;
    private double height;

    public Cylinder(){
        base = new Circle();
        height = 1.0;
    }

    public Cylinder(double height){
        base = new Circle();
        this.height = height;
    }

    public Cylinder(double radius, double height){
        base = new Circle(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color){
        base = new Circle(radius, color);
        this.height = height;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getVolume(){
        return base.getArea() * height;
    }

    public String toString(){
        return "Cylinder[base=" + base.toString() + ",height=" + height + "]";
    }

    public double getArea(){
        return 2 * Math.PI * base.getRadius() * height + 2 * base.getArea();
    }

    public String getColor(){
        return base.getColor();
    }

    public void setColor(String color){
        base.setColor(color);
    }

    public double getRadius(){
        return base.getRadius();
    }

    public void setRadius(double radius){
        base.setRadius(radius);
    }


}
