package sg.edu.ntu.chapterThree.threeTwo;

public class TestMain {
    public static void main(String[] args) {
        // Create two polynomials
        MyPolynomial p1 = new MyPolynomial(1.1, 2.2, 3.3); // 3.3x^2 + 2.2x + 1.1
        MyPolynomial p2 = new MyPolynomial(0.5, -1.5, 2.0, 4.0); // 4.0x^3 + 2.0x^2 - 1.5x + 0.5

        // Print the polynomials
        System.out.println("Polynomial 1: " + p1);
        System.out.println("Polynomial 2: " + p2);

        // Add the polynomials
        MyPolynomial sum = p1.add(p2);
        System.out.println("Sum: " + sum);

        // Multiply the polynomials
        MyPolynomial product = p1.multiply(p2);
        System.out.println("Product: " + product);

        // Evaluate p1 at x = 2
        double evalP1 = p1.evaluate(2);
        System.out.println("p1(2) = " + evalP1);
    }
}
