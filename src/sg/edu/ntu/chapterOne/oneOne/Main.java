package sg.edu.ntu.chapterOne.oneOne;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.printf("The circle has radius of " + c1.getRadius() + " and area of %.2f%n" , c1.getArea());

        Circle c2 = new Circle(2.0);
        System.out.printf("The circle has radius of %.2f and area of %.2f" , c2.getRadius()  , c2.getArea());
    }
}
