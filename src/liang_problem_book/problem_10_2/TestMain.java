package liang_problem_book.problem_10_2;

public class TestMain {
    public static void main(String[] args) {
        BMI bmi1 = new BMI("Kim Yang", 18, 145, 70, 6);
        System.out.println("The BMI for " + bmi1.getName() + " is " + bmi1.getBMI() + " " + bmi1.getStatus());

        BMI bmi2 = new BMI("Susan King", 215, 70);
        System.out.println("The BMI for " + bmi2.getName() + " is " + bmi2.getBMI() + " " + bmi2.getStatus());

        BMI bmi3 = new BMI("Jane Doe", 18, 215, 5, 6);

        System.out.println("The BMI for " + bmi3.getName() + " is " + bmi3.getBMI() + " " + bmi3.getStatus());

        BMI bmi4 = new BMI("John Doe", 215, 5, 6);

        System.out.println("The BMI for " + bmi4.getName() + " is " + bmi4.getBMI() + " " + bmi4.getStatus());

        BMI bmi5 = new BMI("John Doe", 215, 66);

        System.out.println("The BMI for " + bmi5.getName() + " is " + bmi5.getBMI() + " " + bmi5.getStatus());

        BMI bmi6 = new BMI("John Doe", 215, 5.5);

        System.out.println("The BMI for " + bmi6.getName() + " is " + bmi6.getBMI() + " " + bmi6.getStatus());

        BMI bmi7 = new BMI("John Doe", 215, 5.5);

        System.out.println("The BMI for " + bmi7.getName() + " is " + bmi7.getBMI() + " " + bmi7.getStatus());

        BMI bmi8 = new BMI("John Doe", 215, 5.5);

        System.out.println("The BMI for " + bmi8.getName() + " is " + bmi8.getBMI() + " " + bmi8.getStatus());

        BMI bmi9 = new BMI("John Doe", 215, 5.5);
    }
}
