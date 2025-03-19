package liang_problem_book.problem_10_10;

public class Queue {
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 8;

    public Queue() {
        this(DEFAULT_CAPACITY);
    }

    public Queue(int capacity) {
        elements = new int[capacity];
    }
    public boolean empty() {
        return size == 0;
    }
    public void enqueue(int v) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = v;
    }
    public int dequeue() {
        int v = elements[0];
        size--;
        for (int i = 0; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        return v;
    }
    public int getSize() {
        return size;
    }

    public int[] getElements() {
        return elements;
    }

    public void setElements(int[] elements) {
        this.elements = elements;
    }

    public int getElement(int index) {
        return elements[index];
    }

    public void setElement(int index, int value) {
        elements[index] = value;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void clear() {
        size = 0;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }

    public void reverse() {
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }

    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            int min = elements[i];
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (min > elements[j]) {
                    min = elements[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                elements[minIndex] = elements[i];
                elements[i] = min;
            }
        }
    }

    public void shuffle() {
        for (int i = 0; i < size; i++) {
            int randomIndex = (int)(Math.random() * size);
            int temp = elements[i];
            elements[i] = elements[randomIndex];
            elements[randomIndex] = temp;
        }
    }

    public void reverseHalf() {
        for (int i = 0; i < size / 2; i++) {
            int temp = elements[i];
            elements[i] = elements[size - i - 1];
            elements[size - i - 1] = temp;
        }
    }

    public void removeEven() {
        int[] temp = new int[size];
        int tempSize = 0;
        for (int i = 0; i < size; i++) {
            if (elements[i] % 2 != 0) {
                temp[tempSize++] = elements[i];
            }
        }
        elements = temp;
        size = tempSize;
    }

    public void removeOdd() {
        int[] temp = new int[size];
        int tempSize = 0;
        for (int i = 0; i < size; i++) {
            if (elements[i] % 2 == 0) {
                temp[tempSize++] = elements[i];
            }
        }
        elements = temp;
        size = tempSize;
    }

    public void remove(int value) {
        int[] temp = new int[size];
        int tempSize = 0;
        for (int i = 0; i < size; i++) {
            if (elements[i] != value) {
                temp[tempSize++] = elements[i];
            }
        }
        elements = temp;
        size = tempSize;
    }

    public void add(int value) {
        enqueue(value);
    }
}
