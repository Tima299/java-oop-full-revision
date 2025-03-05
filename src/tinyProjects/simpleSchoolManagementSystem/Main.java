package tinyProjects.simpleSchoolManagementSystem;

public class Main {
    public static void main(String[] args) {
        // Create School
        School school = new School(new Teacher[0], new Student[0]);

        // Create Teachers with original names
        Teacher teacher1 = new Teacher(1, "Naseer", "Abdulraheem", 15000, school);
        Teacher teacher2 = new Teacher(2, "Alessandro", "Agostini", 5500, school);

        // Create Students with original names
        Student student1 = new Student(101, "Temur", "Eshboyev", 10, 3000, school);
        Student student2 = new Student(102, "Suxrob", "Ergashev", 11, 3500, school);

        // Add Teachers and Students to the School
        school.addTeacher(teacher1);
        school.addTeacher(teacher2);
        school.addStudent(student1);
        school.addStudent(student2);

        // Students pay fees
        student1.pay(1000);
        student2.pay(1500);

        // Teachers receive salary
        teacher1.receiveSalary(4000);
        teacher2.receiveSalary(4500);

        // Display details
        System.out.println("School Teachers:");
        for (Teacher teacher : school.getTeachers()) {
            System.out.println(teacher);
        }

        System.out.println("\nSchool Students:");
        for (Student student : school.getStudents()) {
            System.out.println(student);
        }

        System.out.println("\nTotal Money Earned: " + school.getTotalMoneyEarned());
        System.out.println("Total Money Spent: " + school.getTotalMoneySpent());
    }
}
