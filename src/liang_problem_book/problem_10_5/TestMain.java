package liang_problem_book.problem_10_5;

public class TestMain {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();
        int number = 120;
        int factor = 2;
        while (factor <= number) {
            if (number % factor == 0) {
                stack.push(factor);
                number /= factor;
            } else {
                factor++;
            }
        }
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
