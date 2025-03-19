package liang_problem_book.problem_10_3;

public class TestMain {
    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(5);
        System.out.println("myInteger.getValue() = " + myInteger.getValue());
        System.out.println("myInteger.isEven() = " + myInteger.isEven());
        System.out.println("myInteger.isOdd() = " + myInteger.isOdd());
        System.out.println("myInteger.isPrime() = " + myInteger.isPrime());
        System.out.println("MyInteger.isEven(5) = " + MyInteger.isEven(5));
        System.out.println("MyInteger.isOdd(5) = " + MyInteger.isOdd(5));
        System.out.println("MyInteger.isPrime(5) = " + MyInteger.isPrime(5));
        System.out.println("MyInteger.isEven(myInteger) = " + MyInteger.isEven(myInteger));
        System.out.println("MyInteger.isOdd(myInteger) = " + MyInteger.isOdd(myInteger));
        System.out.println("MyInteger.isPrime(myInteger) = " + MyInteger.isPrime(myInteger));
    }
}
