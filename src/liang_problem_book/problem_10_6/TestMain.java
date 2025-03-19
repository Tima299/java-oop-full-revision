package liang_problem_book.problem_10_6;

import static liang_problem_book.problem_10_3.MyInteger.isPrime;

public class TestMain {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();

        for (int i = 2; i < 120; i++) {
            if (isPrime(i)) {
                stack.push(i);
            }
        }

        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
