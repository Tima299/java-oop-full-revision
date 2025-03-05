package constructors.nineTen;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double getRoot1() {
        double discriminant = getDiscriminant();
        if (discriminant < 0) {
            return 0;
        }
        return (-b + Math.sqrt(discriminant)) / (2 * a);
    }

    public double getRoot2() {
        double discriminant = getDiscriminant();
        if (discriminant < 0) {
            return 0;
        }
        return (-b - Math.sqrt(discriminant)) / (2 * a);
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
}
