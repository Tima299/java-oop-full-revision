package constructors.nineEleven;

public class Main {
    public static void main(String[] args) {
        LinearEquation eq = new LinearEquation(1, 2, 3, 4, 5, 6);
        if (eq.isSolvable()) {
            System.out.println("X: " + eq.getX());
            System.out.println("Y: " + eq.getY());
        } else {
            System.out.println("The equation has no solution.");
        }
    }
}
