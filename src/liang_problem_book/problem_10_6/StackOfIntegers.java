package liang_problem_book.problem_10_6;

public class StackOfIntegers {
    /*10.6 (Display the prime numbers) Write a program that displays all the prime num-
bers less than 120 in decreasing order. Use the StackOfIntegers class to
store the prime numbers (e.g., 2, 3, 5, . . . ) and retrieve and display them in
reverse order.*/


    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 16;

    public StackOfIntegers() {
        this(DEFAULT_CAPACITY);
    }

    public StackOfIntegers(int capacity) {
        elements = new int[capacity];
    }

    public boolean empty() {
        return size == 0;
    }

    public int peek() {
        return elements[size - 1];
    }

    public void push(int value) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }

        elements[size++] = value;
    }

    public int pop() {
        return elements[--size];
    }

    public int getSize() {
        return size;
    }
}
