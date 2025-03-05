package constructors.nineTen;

public class Main {
    public static void main(String[] args) {
        QuadraticEquation equation = new QuadraticEquation(1, 3, 1);
        double root1 = equation.getRoot1();
        double root2 = equation.getRoot2();
        System.out.println("Root 1: " + root1);
        System.out.println("Root 2: " + root2);

        QuadraticEquation equation2 = new QuadraticEquation( 1, 2, 3);
        double root3 = equation2.getRoot1();
        double root4 = equation2.getRoot2();
        System.out.println("Root 3: " + root3);
        System.out.println("Root 4: " + root4);

    }
}
