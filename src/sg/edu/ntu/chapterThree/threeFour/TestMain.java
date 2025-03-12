package sg.edu.ntu.chapterThree.threeFour;

public class TestMain {
    public static void main(String[] args) {
        // Test constructors
        MyTime time1 = new MyTime();
        MyTime time2 = new MyTime(23, 59, 59);

        System.out.println("Initial time1: " + time1); // Expected: 00:00:00
        System.out.println("Initial time2: " + time2); // Expected: 23:59:59

        // Test setters
        time1.setTime(12, 30, 45);
        System.out.println("After setting time1: " + time1); // Expected: 12:30:45

        // Test getters
        System.out.println("Hour: " + time1.getHour()); // Expected: 12
        System.out.println("Minute: " + time1.getMinute()); // Expected: 30
        System.out.println("Second: " + time1.getSecond()); // Expected: 45

        // Test nextSecond
        System.out.println("Next second: " + time2.nextSecond()); // Expected: 00:00:00

        // Test nextMinute
        time1.setTime(10, 59, 30);
        System.out.println("Next minute: " + time1.nextMinute()); // Expected: 11:00:30

        // Test nextHour
        time1.setTime(23, 0, 0);
        System.out.println("Next hour: " + time1.nextHour()); // Expected: 00:00:00

        // Test previousSecond
        time1.setTime(0, 0, 0);
        System.out.println("Previous second: " + time1.previousSecond()); // Expected: 23:59:59

        // Test previousMinute
        time1.setTime(0, 0, 30);
        System.out.println("Previous minute: " + time1.previousMinute()); // Expected: 23:59:30

        // Test previousHour
        time1.setTime(0, 30, 0);
        System.out.println("Previous hour: " + time1.previousHour()); // Expected: 23:30:00
    }
}
