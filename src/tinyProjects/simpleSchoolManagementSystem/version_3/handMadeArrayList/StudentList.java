package tinyProjects.simpleSchoolManagementSystem.version_3.handMadeArrayList;

import tinyProjects.simpleSchoolManagementSystem.version_3.src.Student;

public class StudentList {
    private Student[] students;
    private static final int CAPACITY = 4;
    private int size;

    public StudentList(){
        students = new Student[CAPACITY];
    }
    public StudentList(int CAPACITY_size){
        students = new Student[CAPACITY_size];
    }
    public Student get(int index){
        return students[index];
    }
    public int capacity(){
        return students.length;
    }
    public Student add(Student student){
        if(students.length<=size){
            Student[] newStudent =  new Student[2*students.length];
            for (int i = 0; i < size; i++) {
                newStudent[i] = students[i];
            }
            students = newStudent;
        }
        students[size++] = student;
        return student;
    }
    public int size(){
        return size;
    }
}
