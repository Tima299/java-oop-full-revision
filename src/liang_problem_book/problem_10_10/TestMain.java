package liang_problem_book.problem_10_10;

public class TestMain {
    public static void main(String[] args) {
        Queue queue = new Queue();
        for (int i = 0; i < 20; i++) {
            queue.enqueue(i);
        }
        while (!queue.empty()) {
            System.out.print(queue.dequeue() + " ");
        }
        System.out.println();

    }
}
