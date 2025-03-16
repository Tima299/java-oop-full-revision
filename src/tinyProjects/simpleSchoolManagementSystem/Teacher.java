package tinyProjects.simpleSchoolManagementSystem;

public class Teacher {
    private int id;
    private String firstName;
    private String lastName;
    private double salary;
    private double salaryEarned;
    private School school;

    public Teacher(int id, String firstName, String lastName, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.salaryEarned = salary;
    }
    public void setSchool(School school) {
        this.school = school;
    }
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public School getSchool() {
        return school;
    }

    public double getSalaryEarned() {
        return salaryEarned;
    }

    public void receiveSalary(double salary) {
        salaryEarned += salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", salaryEarned=" + salaryEarned +
                ", school=" + school +
                '}';
    }
}
