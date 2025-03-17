package tinyProjects.simpleUniversityManagementSystem.version_1;

public class University {
private String name;
private String rectorFirstName;
private String rectorLastName;
private Students[] students;
private Courses[] courses;
private int nextStudentId = 0;
private int nextCourseCode = 0;
public String getName(){
    return name;
}
public University(){
    this.students = new Students[100];
    this.courses = new Courses[10];
}
public void setRector(String firstName, String lastName){
    rectorFirstName =  firstName;
    rectorLastName = lastName;
}
public String getRector(){
    return rectorFirstName + " " + rectorLastName;
}
public Students[] getStudents(){
    return  students;
}
public Courses[] getCourses(){
    return  courses;
}
public void addStudent(Students s){
    students[nextStudentId++] = s;
}
public void addCourses(Courses c){
    courses[nextCourseCode++] = c;
}
}
