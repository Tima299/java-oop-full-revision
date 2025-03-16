package tinyProjects.simpleSchoolManagementSystem.version_3.src;
import tinyProjects.simpleSchoolManagementSystem.version_3.handMadeArrayList.StudentList;
import tinyProjects.simpleSchoolManagementSystem.version_3.handMadeArrayList.TeacherList;

public class School {
    private TeacherList teachers;
    private StudentList students;
    int studentCount = 0;
    int teacherCount = 0;

    public School() {
        this.students = new StudentList();
        this.teachers = new TeacherList();
    }

    public TeacherList getTeachers() {
        return teachers;
    }

    public StudentList getStudents() {
        return students;
    }

    public double getTotalMoneyEarned() {
        double total = 0;
        for (int i = 0; i < studentCount; i++) {
            total += students.get(i).getFeesPaid();
        }
        return total;
    }

    public double getTotalMoneySpent() {
        double spent = 0;
        for (int i = 0; i < teacherCount; i++) {
            spent += teachers.get(i).getSalaryEarned();
        }
        return spent;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
        teacher.setSchool(this);
    }

    public void addStudent(Student student) {
       students.add(student);
    }
}