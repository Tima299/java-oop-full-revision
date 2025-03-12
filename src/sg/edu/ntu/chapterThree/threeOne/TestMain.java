package sg.edu.ntu.chapterThree.threeOne;
import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for two complex numbers
        System.out.print("Enter complex number 1 (real and imaginary part): ");
        double real1 = scanner.nextDouble();
        double imag1 = scanner.nextDouble();
        MyComplex c1 = new MyComplex(real1, imag1);

        System.out.print("Enter complex number 2 (real and imaginary part): ");
        double real2 = scanner.nextDouble();
        double imag2 = scanner.nextDouble();
        MyComplex c2 = new MyComplex(real2, imag2);

        // Display values
        System.out.println("\nNumber 1 is: " + c1);
        System.out.println(c1 + (c1.isReal() ? " is a pure real number" : " is NOT a pure real number"));
        System.out.println(c1 + (c1.isImaginary() ? " is a pure imaginary number" : " is NOT a pure imaginary number"));

        System.out.println("\nNumber 2 is: " + c2);
        System.out.println(c2 + (c2.isReal() ? " is a pure real number" : " is NOT a pure real number"));
        System.out.println(c2 + (c2.isImaginary() ? " is a pure imaginary number" : " is NOT a pure imaginary number"));

        // Check equality
        System.out.println("\n" + c1 + (c1.equals(c2) ? " is equal to " : " is NOT equal to ") + c2);

        // Perform arithmetic operations
        System.out.println(c1 + " + " + c2 + " = " + c1.addNew(c2));
        System.out.println(c1 + " - " + c2 + " = " + c1.subtractNew(c2));
        System.out.println(c1 + " * " + c2 + " = " + c1.multiply(new MyComplex(real2, imag2))); // Reset c1
        System.out.println(c1 + " / " + c2 + " = " + c1.divide(new MyComplex(real2, imag2))); // Reset c1
        System.out.println("Conjugate of " + c1 + " = " + c1.conjugate());

        scanner.close();
    }
}
