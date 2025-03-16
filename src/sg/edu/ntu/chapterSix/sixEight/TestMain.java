package sg.edu.ntu.chapterSix.sixEight;

public class TestMain {
    public static void main(String[] args) {

        // Test MovablePoint
        MovablePoint p1 = new MovablePoint(1, 2, 3, 4);
        System.out.println(p1);
        p1.moveLeft();
        System.out.println(p1);
        p1.moveDown();
        System.out.println(p1);

        // Test MovableCircle
        MovableCircle c1 = new MovableCircle(1, 2, 3, 4, 20);
        System.out.println(c1);
        c1.moveRight();
        System.out.println(c1);
        c1.moveUp();
        System.out.println(c1);

        // Test MovableRectangle
        MovableRectangle r1 = new MovableRectangle(1, 2, 3, 4, 5, 6);
        System.out.println(r1);
        r1.moveLeft();
        System.out.println(r1);
        r1.moveDown();
        System.out.println(r1);

        //What is the difference between an interface and an abstract class?
        //An interface is a reference type in Java, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types.
        //Method bodies exist only for default methods and static methods. Interfaces cannot contain instance fields.
        //The methods in interfaces are abstract by default, and static methods are not abstract.
        //An abstract class is a class that is declared abstract—it may or may not include abstract methods. Abstract classes cannot be instantiated, but they can be subclassed.
        //An abstract class can have instance methods that implement a default behavior. An abstract class can also have abstract methods, which are declared but not implemented.
        //The subclass must implement the abstract methods. An abstract class is a class that is declared abstract—it may or may
        //not include abstract methods. Abstract classes cannot be instantiated, but they can be subclassed. An abstract class can have instance methods that implement a default behavior.
        //An abstract class can also have abstract methods, which are declared but not implemented. The subclass must implement the abstract methods.
        //An abstract class is a class that is declared abstract—it may or may not include abstract methods. Abstract classes cannot be instantiated, but they can be subclassed.
        //An abstract class can have instance methods that implement a default behavior. An abstract class can also have abstract methods, which are declared but not implemented.
    }
}
