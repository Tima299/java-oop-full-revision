package constructors.nineNine;

public class Main {
    public static void main(String[] args) {
        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6, 4);
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("Polygon 1 perimeter: " + polygon1.getPerimeter());
        System.out.println("Polygon 1 area: " + polygon1.getArea());
        System.out.println("Polygon 2 perimeter: " + polygon2.getPerimeter());
        System.out.println("Polygon 2 area: " + polygon2.getArea());
        System.out.println("Polygon 3 perimeter: " + polygon3.getPerimeter());
        System.out.println("Polygon 3 area: " + polygon3.getArea());
    }
}
