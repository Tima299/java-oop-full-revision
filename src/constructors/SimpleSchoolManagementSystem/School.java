package constructors.SimpleSchoolManagementSystem;

import java.util.Arrays;

public class School {
    private Teacher[] teachers;
    private Student[] students;
    private static double totalMoneyEarned;
    private static double totalMoneySpent;

    public School(Teacher[] teachers, Student[] students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        teachers = Arrays.copyOf(teachers, teachers.length + 1);
        teachers[teachers.length - 1] = teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students = Arrays.copyOf(students, students.length + 1);
        students[students.length - 1] = student;
    }

    public double getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static void updateTotalMoneyEarned(double moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    public double getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public static void updateTotalMoneySpent(double moneySpent) {
        totalMoneySpent += moneySpent;
    }
}