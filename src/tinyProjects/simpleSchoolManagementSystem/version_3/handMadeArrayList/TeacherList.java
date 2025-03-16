package tinyProjects.simpleSchoolManagementSystem.version_3.handMadeArrayList;
import tinyProjects.simpleSchoolManagementSystem.version_3.src.Teacher;

public class TeacherList {
    private Teacher[] teachers;
    private static final int CAPACITY = 4;
    private int size;

    public TeacherList(){
        teachers = new Teacher[CAPACITY];
    }
    public TeacherList(int CAPACITY_size){
        teachers = new Teacher[CAPACITY_size];
    }
    public Teacher get(int index){
        return teachers[index];
    }
    public int capacity(){
        return teachers.length;
    }
    public Teacher add(Teacher teacher){
        if(teachers.length<=size){
            Teacher[] newTeacher =  new Teacher[2*teachers.length];
            for (int i = 0; i < size; i++) {
                newTeacher[i] = teachers[i];
            }
            teachers = newTeacher;
        }
        teachers[size++] = teacher;
        return teacher;
    }
    public int size(){
        return size;
    }
}

