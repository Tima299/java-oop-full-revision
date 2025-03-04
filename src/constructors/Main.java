package constructors;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangleOne = new Rectangle(4, 40);
        System.out.printf("Area is %.2f%n", rectangleOne.getArea(4, 40));
        System.out.printf("Perimeter is %.2f%n", rectangleOne.getPerimeter(4, 40));
        System.out.println(" - ".repeat(15));

        Rectangle rectangleTwo = new Rectangle(3.5, 35.9);
        System.out.printf("Area is %.2f%n", rectangleTwo.getArea(3.5, 35.9));
        System.out.printf("Perimeter is %.2f%n", rectangleTwo.getPerimeter(3.5, 35.9));
        System.out.println(" - ".repeat(15));
    }
}
