package tinyProjects.simpleSchoolManagementSystem;

import java.util.Arrays;

public class School {
    private Teacher[] teachers;
    private Student[] students;
    int studentCount = 0;
    int teacherCount = 0;

    public School() {
        this.students =new Student[100];
        this.teachers =new Teacher[100];
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public Student[] getStudents() {
        return students;
    }

    public double getTotalMoneyEarned() {
        double total = 0;
        for (int i = 0; i < studentCount; i++) {
            total += students[i].getFeesPaid();
        }
        return total;
    }

    public double getTotalMoneySpent() {
        double spent = 0;
        for (int i = 0; i < teacherCount; i++) {
            spent += teachers[i].getSalaryEarned();
        }
        return spent;
    }
    public void addTeacher(Teacher teacher) {
        teachers[teacherCount++] = teacher;
        teacher.setSchool(this);
    }
    public void addStudent(Student student) {
        students[studentCount++] = student;
    }
}