package liang_problem_book.problem_10_1;

public class TestMain {
    public static void main(String[] args) {

            Time time1 = new Time(); // Joriy vaqt
            Time time2 = new Time(555550000); // Elapsed time
            Time time3 = new Time(5, 23, 55); // Soat, daqiqa, soniya

            System.out.println("Current time: " + time1);
            System.out.println("Time from 555550000ms: " + time2);
            System.out.println("Custom time (5, 23, 55): " + time3);
        }
}
