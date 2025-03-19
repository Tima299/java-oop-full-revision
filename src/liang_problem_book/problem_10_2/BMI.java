package liang_problem_book.problem_10_2;

public class BMI {
    private String name;
    private int age;
    private double weight;
    private double feet;
    private double inches;

    public BMI(String name, int age, double weight, double feet, double inches) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.feet = feet;
        this.inches = inches;
    }

    public BMI(String name, double weight, double feet, double inches) {
        this(name, 20, weight, feet, inches);
    }

    public BMI(String name, int age, double weight, double height) {
        this(name, age, weight, height / 12, height % 12);
    }

    public BMI(String name, double weight, double height) {
        this(name, 20, weight, height / 12, height % 12);
    }

    public double getBMI() {
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = (feet * 12 + inches) * METERS_PER_INCH;

        return weightInKilograms / (heightInMeters * heightInMeters);
    }

    public String getStatus() {
        double bmi = getBMI();

        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getFeet() {
        return feet;
    }

    public double getInches() {
        return inches;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setFeet(double feet) {
        this.feet = feet;
    }

    public void setInches(double inches) {
        this.inches = inches;
    }

    public void setHeight(double height) {
        this.feet = height / 12;
        this.inches = height % 12;
    }

    public void setHeight(double feet, double inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public void setHeightInInches(double height) {
        this.feet = height / 12;
        this.inches = height % 12;
    }

    public void setHeightInMeters(double height) {
        final double METERS_PER_INCH = 0.0254;

        double totalInches = height / METERS_PER_INCH;
        this.feet = totalInches / 12;
        this.inches = totalInches % 12;
    }

    public void setHeightInFeet(double feet, double inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public void setHeightInFeet(double feet) {
        this.feet = feet;
    }

    public void setHeightInFeetInches(double feet, double inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public void setHeightInFeetInInches(double feet, double inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public void setHeightInFeetInInches(double feet) {
        this.feet = feet;
    }

}
