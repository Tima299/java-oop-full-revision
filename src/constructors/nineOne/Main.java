package constructors.nineOne;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangleOne = new Rectangle(4, 40);
        System.out.printf("Width: %.2f, Height: %.2f%n", rectangleOne.width, rectangleOne.height);
        System.out.printf("Area: %.2f%n", rectangleOne.getArea());
        System.out.printf("Perimeter: %.2f%n", rectangleOne.getPerimeter());
        System.out.println(" - ".repeat(15));

        Rectangle rectangleTwo = new Rectangle(3.5, 35.9);
        System.out.printf("Width: %.2f, Height: %.2f%n", rectangleTwo.width, rectangleTwo.height);
        System.out.printf("Area: %.2f%n", rectangleTwo.getArea());
        System.out.printf("Perimeter: %.2f%n", rectangleTwo.getPerimeter());
        System.out.println(" - ".repeat(15));
    }
}
